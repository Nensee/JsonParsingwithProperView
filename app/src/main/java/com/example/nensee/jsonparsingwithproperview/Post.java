package com.example.nensee.jsonparsingwithproperview;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by nensee on 2/7/17.
 */
public class Post
{
    private String userid;
    private String id;
    private String title;
    private String description;

    Context context;
    LayoutInflater inflater;
    ArrayList<Post> posts;



    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
