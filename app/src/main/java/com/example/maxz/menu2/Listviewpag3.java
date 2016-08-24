package com.example.maxz.menu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listviewpag3 extends AppCompatActivity {

    ListView menu3ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpag3);


        bindWidgget();

        Showpic();

    }//main method

    //method Shoe pic
    private void Showpic() {


        final int[] iconInts = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5};


        final String[] data= new String[5];
        data[0] = "ต้มยำกุ้ง";
        data[1] = "ต้มยำหมู";
        data[2] = "ต้มจืด";
        data[3] = "ต้มเลือดหมู";
        data[4] = "ต้มมะละ";

        final String[] dataStrings = getResources().getStringArray(R.array.menu3);

        //call AD
        MyAD myAD = new MyAD(Listviewpag3.this,data,dataStrings, iconInts);
        menu3ListView.setAdapter(myAD);

        menu3ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Listviewpag3.this, Detsail.class);

                intent.putExtra("name", dataStrings[position]);
                intent.putExtra("Image", iconInts[position]);
                intent.putExtra("Index", position);

                startActivity(intent);


            }
        });


    }
    private void bindWidgget() {
        menu3ListView = (ListView) findViewById(R.id.listView);


    }
}//main class
