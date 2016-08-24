package com.example.maxz.menu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listviewpag extends AppCompatActivity {

    ListView menutongListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpag);


        bindWidgget();

        Showpic();

    }//main method

    //method Shoe pic
    private void Showpic() {


        final int[] iconInts = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.b, R.drawable.f};


        final String[] data= new String[5];
        data[0] = "กุ้งทอด";
        data[1] = "ไก่ทอดใบกระเพรากรอบ";
        data[2] = "ไก่ทอดน้ำปลา";
        data[3] = "ปลาทอด";
        data[4] = "นักเก็ตทอด";

        final String[] dataStrings = getResources().getStringArray(R.array.namemenu);

        //call AD
        MyAD myAD = new MyAD(Listviewpag.this,data,dataStrings, iconInts);
        menutongListView.setAdapter(myAD);

        menutongListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Listviewpag.this, Detsail.class);

                intent.putExtra("name", dataStrings[position]);
                intent.putExtra("Image", iconInts[position]);
                intent.putExtra("Index", position);

                startActivity(intent);


            }
        });


    }
    private void bindWidgget() {
        menutongListView = (ListView) findViewById(R.id.listView);


    }
}//main class
