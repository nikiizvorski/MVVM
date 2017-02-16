package com.nikiizvorski.mvvm.di.user;


import android.content.Context;

import com.nikiizvorski.mvvm.viewmodel.main.MainInteractor;
import com.nikiizvorski.mvvm.viewmodel.main.MainViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModel {
    private Context context;

    public UserModel(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    Context getContext() {
        return context;
    }

    @Singleton
    @Provides
    MainInteractor mainInteractor(){
        return new MainInteractor();
    }

    @Singleton
    @Provides
    MainViewModel mainViewModel(Context context, MainInteractor mainInteractor){
        return new MainViewModel(context, mainInteractor);
    }
}
