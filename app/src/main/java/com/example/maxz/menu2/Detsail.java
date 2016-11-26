package com.example.maxz.menu2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Detsail extends AppCompatActivity {
    //ประกาศตัวแปลนะ
    TextView nametextView,detailTextView;
    ImageView iconImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detsail);
        //เชื่อมนหน้า UI ด้วย findViewById
        nametextView = (TextView) findViewById(R.id.textView2);
        detailTextView = (TextView) findViewById(R.id.textView3);
        iconImageView = (ImageView) findViewById(R.id.imageView2);


        //เป็นการเรียกใช้ method Showdetail
        Showdetail();



    }//main method

    private void Showdetail() {

        //รับค่า Intent จากหน้า Listviewpag ด้วยการประกาศตัวแปรชนิดเดียวกับหน้าที่ส่ง เพื่อรับชื่อและชื่อนั้นต้องตรงกันกับตัวที่ส่ง
        String strname = getIntent().getStringExtra("name");
        int icon = getIntent().getIntExtra("Image", R.drawable.a);
        int Index = getIntent().getIntExtra("Index", 0);

        //นำเอาค่าที่ได้มาแสดงในแต่ละตัวแปร
        nametextView.setText(strname);
        iconImageView.setImageResource(icon);

        String[] detail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(detail[Index]);

    }//Showdetail


}//main class
