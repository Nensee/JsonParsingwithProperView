package com.example.nensee.jsonparsingwithproperview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nensee on 2/7/17.
 */
public class JsonObjectdemo extends BaseAdapter{

    Context context;
    ArrayList<Post> posts;
    LayoutInflater layoutInflater;

    JsonObjectdemo(Context context,LayoutInflater layoutInflater,ArrayList<Post> posts)
    {
        this.context=context;
        this.posts=posts;
        this.layoutInflater=layoutInflater;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.listview, parent, false);
        TextView uid = (TextView) view.findViewById(R.id.txtviw1);
        TextView iid = (TextView) view.findViewById(R.id.txtviw2);
        TextView tile = (TextView) view.findViewById(R.id.txtviw3);
        TextView desc = (TextView) view.findViewById(R.id.txtviw4);

        return  view;
    }
}
