package com.naive.moodswing.effectivedivision.viewmodel;

import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;

import com.naive.moodswing.effectivedivision.model.CollectBook;
import com.naive.moodswing.effectivedivision.model.item.BaseCollectItem;

import java.util.Observable;

/**
 * Created by inkyu.park on 2018. 4. 20..
 */

public class CollectorViewModel implements ViewModel {

    private CollectBook model;

    public final ObservableArrayMap<String, String> pages = new ObservableArrayMap<>();
    public final ObservableField<String> selectedItem = new ObservableField<>();

    public CollectorViewModel(){
        model = new CollectBook();
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }


    public void onClickPageAt(int index){
        BaseCollectItem selectedItem = model.mark(index);
        pages.put(""+index, )
    }
}
