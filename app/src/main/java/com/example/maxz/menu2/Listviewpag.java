package com.example.maxz.menu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listviewpag extends AppCompatActivity {
    //ประการตัวแปร ListView
    ListView menutongListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpag);
        //เชื่อมหน้า UI ด้วย findViewById
        menutongListView = (ListView) findViewById(R.id.listView);

        //เรียกใช้ method Showpic()
        Showpic();

    }//main method

    //method Showpic
    private void Showpic() {

        //ทำการประกาศตัวเป็น array =[] และเอารูปใส่ในแต่ละ array
        final int[] iconInts = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.b, R.drawable.f};

        //ทำการประกาศตัวเป็น array =[] และ กำหนดว่าข้อมูลเรามีเท่าไหร่ จากนั้นก็ใส่ชื่ออาหาร
        final String[] data= new String[5];
        data[0] = "กุ้งทอด";
        data[1] = "ไก่ทอดใบกระเพรากรอบ";
        data[2] = "ไก่ทอดน้ำปลา";
        data[3] = "ปลาทอด";
        data[4] = "นักเก็ตทอด";

        //ประกาศตัวแปรให้ชื่อเหมือน กับ ตัวแปรใน Class MyAD จากนั้นทำการใส่ค่า จาก หน้า array ด้วยคำสั่ง R.array.ชื่อของ array
        final String[] dataStrings = getResources().getStringArray(R.array.namemenu);

        //เชื่อมต่อกับ Class MyAD จากนั้นเราจะส่งค่า dataStrings,iconInts
        MyAD myAD = new MyAD(Listviewpag.this,dataStrings, iconInts);
//        ทำการ setAdapter ให้การ ListView เพราะเราไม่สามารถใส่ของมูลลง ListView ได้โดยตรง จึงต้องสร้าง Adapter ที่ชื่อว่า MyAD
        menutongListView.setAdapter(myAD);
        //ทำให้ ListView  แต่ละอัน คลิกได้และเลื่อนได้
        menutongListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //คลิกแล้วให้มันทำอะไรต่อ
                Intent intent = new Intent(Listviewpag.this, Detsail.class);
                //ส่งข้อมูลที่คลิกไปยัง Detsail.class

                //ด้วยการตั้งชื่อ และ ข้อมูล
                intent.putExtra("name", dataStrings[position]);
                intent.putExtra("Image", iconInts[position]);
                intent.putExtra("Index", position);

                startActivity(intent);


            }
        });


    }

}//main class
