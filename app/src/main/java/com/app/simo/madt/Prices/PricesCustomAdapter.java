package com.app.simo.madt.Prices;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.simo.madt.MainActivity;
import com.app.simo.madt.R;

import java.util.List;

public class PricesCustomAdapter extends ArrayAdapter<Price> {
    public PricesCustomAdapter(Context context, int resource, List<Price> price) {
        super(context, resource, price);
    }


    public PricesCustomAdapter(MainActivity context, int price_list_item, List<Price> prices) {
        super(context, price_list_item, prices);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        }

        // Get the data item for this position
        Price ph = getItem(position);

        TextView tvprice = (TextView) convertView.findViewById(R.id.category);

        tvprice.setText(ph.getPrice());


        // Return the completed view to render on screen
        return convertView;
    }
}

