package com.nikiizvorski.mvvm.viewmodel.main;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;

import com.nikiizvorski.mvvm.model.User;

import javax.inject.Inject;

public class MainInteractor {

    @Inject
    public MainInteractor() {}

    User setUser() {
        return new User("First Name", "Last Name");
    }

    ObservableArrayList<User> setUsers() {
        return new ObservableArrayList<>();
    }

    ObservableField<String> setFirstName() {
        return new ObservableField<>();
    }

    ObservableField<String> setLastName() {
        return new ObservableField<>();
    }

    void createNewUser(String first, String last, ObservableArrayList<User> users) {
        User user = new User(first, last);
        users.add(user);
    }
}
