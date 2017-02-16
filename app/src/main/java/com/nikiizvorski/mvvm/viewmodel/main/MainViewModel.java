package com.nikiizvorski.mvvm.viewmodel.main;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.nikiizvorski.mvvm.R;
import com.nikiizvorski.mvvm.model.User;
import com.nikiizvorski.mvvm.view.main.MainActivity;

import javax.inject.Inject;

public class MainViewModel {
    @Inject Context context;
    @Inject MainInteractor mainInteractor;
    public ObservableArrayList<User> users;
    public User user;
    private ObservableField<String> firstName;
    private ObservableField<String> secondName;

    @Inject
    public MainViewModel(Context context, MainInteractor mainInteractor) {
        this.context = context;
        this.mainInteractor = mainInteractor;
        user = this.mainInteractor.setUser();
        users = this.mainInteractor.setUsers();
        firstName = this.mainInteractor.setFirstName();
        secondName = this.mainInteractor.setLastName();
    }

    public ObservableField<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(ObservableField<String> firstName) {
        this.firstName = firstName;
    }

    public ObservableField<String> getSecondName() {
        return secondName;
    }

    public void setSecondName(ObservableField<String> secondName) {
        this.secondName = secondName;
    }

    public void onClickMe(View view){
        Toast.makeText(context, "Great", Toast.LENGTH_SHORT).show();
    }

    public void addTheUser(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "AddUser: " + getFirstName().get(), Toast.LENGTH_SHORT).show();
                mainInteractor.createNewUser(getFirstName().get(),getSecondName().get(),users);
            }
        });
    }

    @BindingAdapter("app:onWhatEver")
    public static void userInput(Button button, int height){
        button.setText(String.valueOf(height));
    }

    @BindingAdapter("app:onUserLoad")
    public static void userLoadData(ListView listView, final ObservableArrayList<User> users){

        listView.setAdapter(new ArrayAdapter<>(listView.getContext(), android.R.layout.simple_list_item_1, users));
        listView.setEmptyView(listView.getRootView().findViewById(R.id.textView));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("ABE NOV", "USER: " + users.get(position).getFirstName() + " " + users.get(position).getLastName());
                view.getContext().startActivity(MainActivity.launchDetail(view.getContext(), users.get(position)));
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @SuppressWarnings("SuspiciousMethodCalls")
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                users.remove(parent.getItemAtPosition(position));
                return false;
            }
        });
    }
}

