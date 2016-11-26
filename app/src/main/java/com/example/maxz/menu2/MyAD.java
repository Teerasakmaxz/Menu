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
public class MyAD extends BaseAdapter {//คลาสนี้ เรา extends มาจาก BaseAdapter เพราะคลาสนี้มีคุณสมบัติ เอาไว้ใช้ทำ Count data ที่เรากรอกทั้งหมด(ทอด,ต้ม,... )
    //ประกาศตัวแปร
    private Context odjContext;
    private String[] dataStrings;
    private int[] iconInts;

    //ทำ constructor หมายความว่า  เราจะสร้าง method ชื่อเดียวกับ คลาส เพื่อเอาตัวแปรที่เราประกาศไว้ เอาไปใช้ในคลาสอื่นๆต่อไป
    public MyAD(Context odjContext, String[] dataStrings, int[] iconInts) {
        this.odjContext = odjContext;
        this.dataStrings = dataStrings;
        this.iconInts = iconInts;
    }


    @Override
    public int getCount() {
        //ทำการนับจำนวน data
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



        //เรีกใช้ layout ที่บสร้างขึ้นโดยไม่มีคลาส java มาด้วย
        LayoutInflater layoutInflater = (LayoutInflater) odjContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //เก็บค่า layout ที่เรียกมา อยู่ในตัวแปร ชื่อว่า ojdview
        View ojdview = layoutInflater.inflate(R.layout.my_deteail,parent,false);


//        ทำการเชื่อ TextView เข้ากับหน้า UI ที่อยู่ในตัว ojdview
        TextView dataTextView = (TextView) ojdview.findViewById(R.id.textView);
        //ทำการเปลี่ยนค่าของ dataTextView ด้วยคำสั่ง .setText()
        dataTextView.setText(dataStrings[position]);


        //ทำการเชื่อ ImageView เข้ากับหน้า UI ที่อยู่ในตัว ojdview
        ImageView imageView = (ImageView) ojdview.findViewById(R.id.imageView);
        //ทำการเปลี่ยนค่าของ imageView ด้วยคำสั่ง .setImageResource()
        imageView.setImageResource(iconInts[position]);

        return ojdview;
    }
}
