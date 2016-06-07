package com.app.simo.madt.Ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.app.simo.madt.Interface.Endpoint;
import com.app.simo.madt.Prices.PricesCustomAdapter;
import com.app.simo.madt.ProduceDetails.ProduceDetails;
import com.app.simo.madt.R;
import com.app.simo.madt.RetrofitBuilder.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ProduceDetail extends AppCompatActivity implements Callback<ProduceDetails> {

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produce_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        build();
    }

    public void build() {

        Bundle b = this.getIntent().getExtras();
        id = b.getInt("identity");

        Retrofit retrofit = RetrofitBuilder.build();

        Endpoint endpoint = retrofit.create(Endpoint.class);

        Call<ProduceDetails> call = endpoint.listProduce(id);

        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<ProduceDetails> call, Response<ProduceDetails> response) {

        ProduceDetails produce = response.body();
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(produce.getName());
        }

        ListView list = (ListView) findViewById(R.id.listViewProduceDetails);
        final PricesCustomAdapter pricesCustomAdapter = new PricesCustomAdapter(ProduceDetail.this, R.layout.price_list_item, produce.getPrices());
        list.setAdapter(pricesCustomAdapter);

    }

    @Override
    public void onFailure(Call<ProduceDetails> call, Throwable t) {

    }

}
