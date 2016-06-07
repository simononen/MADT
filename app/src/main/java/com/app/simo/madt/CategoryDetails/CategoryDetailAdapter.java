package com.app.simo.madt.CategoryDetails;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.simo.madt.R;

import java.util.List;

public class CategoryDetailAdapter extends ArrayAdapter<CategoriesDetails> {
    public CategoryDetailAdapter(Context context, int resource, List<CategoriesDetails> category) {
        super(context, resource, category);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
           // convertView = LayoutInflater.from(getContext()).inflate(R.layout.categories_detail_list_item, parent, false);
        }

        // Get the data item for this position
        CategoriesDetails cd = getItem(position);

        TextView tvprice = (TextView) convertView.findViewById(R.id.category);



        // Return the completed view to render on screen
        return convertView;
    }
}
