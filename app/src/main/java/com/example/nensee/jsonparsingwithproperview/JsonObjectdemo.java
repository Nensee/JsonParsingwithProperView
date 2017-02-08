package com.example.nensee.jsonparsingwithproperview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by nensee on 2/7/17.
 */
public class JsonObjectdemo extends BaseAdapter {

    Context context;
    ArrayList<Post> posts;
    LayoutInflater layoutInflater;


    JsonObjectdemo(Context context,ArrayList<Post> posts)
    {
        this.context=context;
        this.posts=posts;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder
    {
        TextView uid;
        TextView iid;
        TextView tile;
        TextView desc;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder;

        if(convertView==null) {
            holder = new ViewHolder();

            convertView = LayoutInflater.from(context).inflate(R.layout.listview, parent, false);
            holder.uid = (TextView) convertView.findViewById(R.id.txtviw1);
            holder.iid = (TextView) convertView.findViewById(R.id.txtviw2);
            holder.tile = (TextView) convertView.findViewById(R.id.txtviw3);
            holder.desc = (TextView) convertView.findViewById(R.id.txtviw4);

            convertView.setTag(holder);
        }
        else
        {
            holder=(ViewHolder)convertView.getTag();
        }

        holder.uid.setText(posts.get(position).getUserid());
        holder.iid.setText(posts.get(position).getId());
        holder.tile.setText(posts.get(position).getTitle());
        holder.desc.setText(posts.get(position).getDescription());
        return convertView;
    }
}
