package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class itemAdapter extends ArrayAdapter {

    List<Item> itemList;

    public itemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemList = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);

        Item currentItem = itemList.get(position);

        TextView itemNameTextView = view.findViewById(R.id.TV1);
        TextView itemPriceTextView = view.findViewById(R.id.TV2);
        ImageView itemImageView = view.findViewById(R.id.itemImage);

        itemNameTextView.setText(currentItem.getItemName());
        itemPriceTextView.setText("" + currentItem.getItemPrice());
        itemImageView.setImageResource(currentItem.getItemImage());

        return view;
    }

}

