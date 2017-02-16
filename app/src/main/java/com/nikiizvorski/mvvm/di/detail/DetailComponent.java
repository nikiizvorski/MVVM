package com.nikiizvorski.mvvm.di.detail;

import com.nikiizvorski.mvvm.view.detail.DetailsActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DetailModel.class)
public interface DetailComponent {
    void inject(DetailsActivity detailsActivity);
}
