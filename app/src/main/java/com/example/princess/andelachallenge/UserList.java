package com.example.princess.andelachallenge;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Princess on 4/23/2017.
 */

public class UserList {

    @SerializedName("items")
    @Expose
    private List<UserInformation> items = null;

    //Getters and Setters for the above list<UserInfromation> of items
    public List<UserInformation> getItems() {
        return items;
    }

    public void setItems(List<UserInformation> items) {
        this.items = items;
    }



}