package com.nikiizvorski.mvvm.di.user;

import com.nikiizvorski.mvvm.view.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = UserModel.class)
public interface UserComponent {
    void inject(MainActivity mainActivity);
}
