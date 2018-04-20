package com.naive.moodswing.effectivedivision.model;

import com.naive.moodswing.effectivedivision.model.item.BaseCollectItem;

/**
 * Created by inkyu.park on 2018. 4. 20..
 */

public class CollectBook {

    private Page[] pages = new Page[2];

    private BaseCollectItem selectedItem;


    public CollectBook() {
        restart();
    }

    public void restart() {
        initPages();
    }

    public void initPages() {
        for(Page page : pages) {
            page = new Page();
        }
    }
}

