package com.nikiizvorski.mvvm.view.main;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nikiizvorski.mvvm.R;
import com.nikiizvorski.mvvm.databinding.ActivityMainBinding;
import com.nikiizvorski.mvvm.di.user.DaggerUserComponent;
import com.nikiizvorski.mvvm.di.user.UserModel;
import com.nikiizvorski.mvvm.model.User;
import com.nikiizvorski.mvvm.view.detail.DetailsActivity;
import com.nikiizvorski.mvvm.viewmodel.main.MainViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject MainViewModel mainViewModel;
    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initModel();
    }

    private void initModel() {
        DaggerUserComponent.builder().userModel(new UserModel(this)).build().inject(this);
        binding.setMainViewModel(mainViewModel);
    }

    public static Intent launchDetail(Context context, User user) {
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra("USER", user);
        return intent;
    }
}
