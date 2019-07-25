package com.example.myrestaurant01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    Context mContext;
    Food[] mFoods;

    MyAdapter(Context context, Food[] books) {
    }

    @Override
    public Object getItem(int position) {
        return mFoods[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return mFoods.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v  = View.inflate(mContext, R.layout.activity_details, null);
        TextView foodName = v.findViewById(R.id.foodName);
        TextView foodPrice = v.findViewById(R.id.foodPrice);
        TextView foodDesc = v.findViewById(R.id.foodDescription);
        ImageView image = v.findViewById(R.id.imageDescription);

        return v;
    }

}
