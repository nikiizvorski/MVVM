package com.nikiizvorski.mvvm.di.detail;

import android.content.Context;

import com.nikiizvorski.mvvm.model.User;
import com.nikiizvorski.mvvm.viewmodel.detail.DetailsViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailModel {
    private User user;

    public DetailModel(User user) {
        this.user = user;
    }

    @Singleton
    @Provides
    User getUser() {
        return user;
    }

    @Singleton
    @Provides
    DetailsViewModel detailsViewModel(User user){
        return new DetailsViewModel(user);
    }
}
