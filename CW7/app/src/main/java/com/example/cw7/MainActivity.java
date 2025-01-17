package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Item item1 = new Item("cheese",R.drawable.cheese,2.0);
       Item item2 = new Item("chocolate",R.drawable.chocolate,3.0);
       Item item3 = new Item("coffee",R.drawable.coffee,2.0);
       Item item4 = new Item("donut",R.drawable.donut,3.5);
       Item item5 = new Item("fires",R.drawable.fries,4.0);
       Item item6 = new Item("honey",R.drawable.honey,6.0);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);

        itemAdapter itemAdapter = new itemAdapter(this, 0,items);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemAdapter);
}


}