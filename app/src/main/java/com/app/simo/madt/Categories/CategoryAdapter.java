package com.app.simo.madt.Categories;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.simo.madt.R;

import java.util.List;

public class CategoryAdapter extends ArrayAdapter<Category> {
    public CategoryAdapter(Context context, int resource, List<Category> category) {
        super(context, resource, category);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        }

        // Get the data item for this position
        Category ph = getItem(position);

        TextView tvprice = (TextView) convertView.findViewById(R.id.category);

        tvprice.setText(ph.getName());


        // Return the completed view to render on screen
        return convertView;
    }
}

