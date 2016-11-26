package com.example.maxz.menu2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //ประกาศตัวแปลนะจ๊ะ
    Button button1,button2,button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //เชื่อม UI ด้วย findViewId
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        //setOnClick คือทำให้ปุ่มสามารถคลิกได้
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //กำหนดว่าจะให้ปุ่มนี้ทำอะไร
                Intent intent = new Intent(MainActivity.this, Listviewpag.class);
                startActivity(intent);
                // Intent เป็นคำสั่งที่เอาไว้เพื่อการส่งข้อมูลไปอีกหน้าหนึ่ง แต่อันที่เราทำกันเป็นแค่ เปลี่ยนหน้ายังไม่ได้ส่งข้อมูล
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Listviewpag2.class);
                startActivity(intent1);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Listviewpag4.class);
                startActivity(intent2);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Listviewpag3.class);
                startActivity(intent3);
            }
        });
    }

}
