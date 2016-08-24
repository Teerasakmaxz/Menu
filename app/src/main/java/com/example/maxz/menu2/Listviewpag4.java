package com.example.maxz.menu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listviewpag4 extends AppCompatActivity {

    ListView menu4ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpag4);


        bindWidgget();

        Showpic();

    }//main method

    //method Shoe pic
    private void Showpic() {


        final int[] iconInts = {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5};


        final String[] data= new String[5];
        data[0] = "ผัดหอยลาย";
        data[1] = "ผัดหมูมะม่วง";
        data[2] = "ผัดผักบุ้ง";
        data[3] = "ผัดวุ้นเส้น";
        data[4] = "ผัดคะน้าหมูกรอบ";

        final String[] dataStrings = getResources().getStringArray(R.array.menu4);

        //call AD
        MyAD myAD = new MyAD(Listviewpag4.this,data,dataStrings, iconInts);
        menu4ListView.setAdapter(myAD);

        menu4ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Listviewpag4.this, Detsail.class);

                intent.putExtra("name", dataStrings[position]);
                intent.putExtra("Image", iconInts[position]);
                intent.putExtra("Index", position);

                startActivity(intent);


            }
        });


    }
    private void bindWidgget() {
        menu4ListView = (ListView) findViewById(R.id.listView);


    }
}//main class
