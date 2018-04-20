package com.naive.moodswing.effectivedivision.model.item;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inkyu.park on 2018. 4. 20..
 */

public class BaseCollectItem {
    protected String itemName = "BaseCollectItem";
    private List<Pair<String, Float>> ingredientList;
    private boolean isOwned;

    public BaseCollectItem() {
        ingredientList = new ArrayList<>();
    }

    public boolean isOwned() {
        return isOwned;
    }

    public void setOwned(boolean owned) {
        isOwned = owned;
    }

    public List<Pair<String, Float>> getIngredientList(){
        return ingredientList;
    }

    public void addIngredient(String elementName, float percentage) {
        Pair<String, Float> element = new Pair<>(elementName, percentage);
        ingredientList.add(element);
    }

    public void updateIngredient(int ingredientIndex, String elementName, float percentage) {
        Pair<String, Float> element = new Pair<>(elementName, percentage);
        ingredientList.set(ingredientIndex, element);
    }

    public String getItemName() {
        return itemName;
    }
}
