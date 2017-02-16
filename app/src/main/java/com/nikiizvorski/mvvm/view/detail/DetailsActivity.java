package com.nikiizvorski.mvvm.view.detail;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nikiizvorski.mvvm.R;
import com.nikiizvorski.mvvm.databinding.ActivityDetailsBinding;
import com.nikiizvorski.mvvm.di.detail.DaggerDetailComponent;
import com.nikiizvorski.mvvm.di.detail.DetailModel;
import com.nikiizvorski.mvvm.model.User;
import com.nikiizvorski.mvvm.viewmodel.detail.DetailsViewModel;

import javax.inject.Inject;

public class DetailsActivity extends AppCompatActivity {
    @Inject DetailsViewModel detailsViewModel;
    private ActivityDetailsBinding activityDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getExtrasFromIntent();
    }

    private void getExtrasFromIntent() {
        activityDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_details);
        User nov = getIntent().getParcelableExtra("USER");
        initModel(nov);
    }

    private void initModel(User user) {
        DaggerDetailComponent.builder().detailModel(new DetailModel(user)).build().inject(this);
        activityDetailsBinding.setDetailsViewModel(detailsViewModel);
        setTitle(user.getFirstName() + " " + user.getLastName());
    }
}
