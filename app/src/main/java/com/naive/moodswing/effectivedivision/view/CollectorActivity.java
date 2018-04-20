package com.naive.moodswing.effectivedivision.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.naive.moodswing.effectivedivision.R;
import com.naive.moodswing.effectivedivision.databinding.ActivityMainBinding;
import com.naive.moodswing.effectivedivision.viewmodel.CollectorViewModel;

/**
 * Created by inkyu.park on 2018. 4. 20..
 */

public class CollectorActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    CollectorViewModel viewModel = new CollectorViewModel();


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setViewModel(viewModel);
        viewModel.onCreate();
    }

    @Override
    protected void onPause(){
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        viewModel.onDestroy();
    }

    @Override
    protected void onResume(){
        super.onResume();
        viewModel.onResume();
    }
}
