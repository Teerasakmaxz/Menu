package com.example.maxz.menu2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by maxz on 8/7/16 AD.
 */
public class MyAD extends BaseAdapter {
    //ประกาศตัวแปร
    private Context odjContext;
    private String[] dataStrings,data;
    private int[] iconInts;


    public MyAD(Context odjContext, String[] data, String[] dataStrings, int[] iconInts) {
        this.odjContext = odjContext;
        //this.data = data;
        this.dataStrings = dataStrings;
        this.iconInts = iconInts;
    }


    @Override
    public int getCount() {
        return dataStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) odjContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ojdview = layoutInflater.inflate(R.layout.my_deteail,parent,false);

        //TextView TitleTextView = (TextView) ojdview.findViewById(R.id.textView);
      // TitleTextView.setText(data[position]);

        TextView dataTextView = (TextView) ojdview.findViewById(R.id.textView);
        dataTextView.setText(dataStrings[position]);

        ImageView imageView = (ImageView) ojdview.findViewById(R.id.imageView);
        imageView.setImageResource(iconInts[position]);





        return ojdview;
    }
}
