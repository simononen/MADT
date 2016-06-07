package com.app.simo.madt.ProduceDetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.simo.madt.Prices.Price;
import com.app.simo.madt.R;
import com.app.simo.madt.Ui.ProduceDetail;

import java.util.List;

public class ProduceAdapter extends ArrayAdapter<Price>  {


    public ProduceAdapter(ProduceDetail context, int price_list_item, List<Price> prices) {
        super(context, price_list_item, prices);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.price_list_item, parent, false);
        }

        // Get the data item for this position
        Price ph = getItem(position);
        //Market mkt = getItem(position);

        //TextView tvName = (TextView) convertView.findViewById(R.id.produceName);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.producePrice);

        //tvName.setText(ph.get);
        tvPrice.setText(ph.getMarket().getName());



        // Return the completed view to render on screen
        return convertView;
    }
}
