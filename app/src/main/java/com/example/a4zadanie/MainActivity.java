package com.example.a4zadanie;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {


    String[] things = {"Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, things);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener itemlistener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intetn1 = new Intent(MainActivity.this, Argentina.class);
                        startActivity(intetn1);
                        break;
                    case 1:
                        Intent intetn2 = new Intent(MainActivity.this, Brazilia.class);
                        startActivity(intetn2);
                        break;
                    case 2:
                        Intent intetn3 = new Intent(MainActivity.this, Chili.class);
                        startActivity(intetn3);
                        break;
                    case 3:
                        Intent intetn4 = new Intent(MainActivity.this, Columbia.class);
                        startActivity(intetn4);
                        break;
                    case 4:
                        Intent intetn5 = new Intent(MainActivity.this, Urugvay.class);
                        startActivity(intetn5);
                        break;
                }
                Toast.makeText(getApplicationContext(), "Вы выбрали флаг"
                        + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                
            }
       };
       getListView().setOnItemClickListener(itemlistener);
    }
}