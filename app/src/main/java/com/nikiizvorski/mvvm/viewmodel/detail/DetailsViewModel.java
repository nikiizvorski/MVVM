package com.nikiizvorski.mvvm.viewmodel.detail;

import com.nikiizvorski.mvvm.model.User;

import javax.inject.Inject;


public class DetailsViewModel{
    @Inject User user;

    @Inject
    public DetailsViewModel(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
