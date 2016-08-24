package com.example.maxz.menu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listviewpag2 extends AppCompatActivity {

    ListView menu2ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpag2);
        bindWidgget();

        Showpic();

    }//main method

    //method Shoe pic
    private void Showpic() {


        final int[] iconInts = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5};


        final String[] data= new String[5];
        data[0] = "ปลานึ่ง";
        data[1] = "หมึกนึ่ง";
        data[2] = "ห่อหมก";
        data[3] = "ปลานึ่งมะนาว";
        data[4] = "ผักกาดนึ่ง";

        final String[] dataStrings = getResources().getStringArray(R.array.memu2);

        //call AD
        MyAD myAD = new MyAD(Listviewpag2.this,data,dataStrings, iconInts);
        menu2ListView.setAdapter(myAD);

       menu2ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Listviewpag2.this, Detsail.class);

                intent.putExtra("name", dataStrings[position]);
                intent.putExtra("Image", iconInts[position]);
                intent.putExtra("Index", position);

                startActivity(intent);


            }
        });


    }
    private void bindWidgget() {
        menu2ListView = (ListView) findViewById(R.id.listView);


    }
}//main class

