package com.app.simo.madt.Produces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.simo.madt.R;

import java.util.List;

/**
 * Created by simo on 6/6/16.
 */
public class ProduceCustomAdapter extends ArrayAdapter<Produce> {
    public ProduceCustomAdapter(Context context, int resource, List<Produce> produces) {
        super(context, resource, produces);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.prodice_list_item, parent, false);
        }

        // Get the data item for this position
        Produce ph = getItem(position);

        TextView tvproduce = (TextView) convertView.findViewById(R.id.produce_item);

        tvproduce.setText(ph.getName());


        // Return the completed view to render on screen
        return convertView;
    }
}
