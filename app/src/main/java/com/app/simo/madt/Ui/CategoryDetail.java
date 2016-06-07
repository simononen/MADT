package com.app.simo.madt.Ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.app.simo.madt.CategoryDetails.CategoriesDetails;
import com.app.simo.madt.Interface.Endpoint;
import com.app.simo.madt.Produces.Produce;
import com.app.simo.madt.Produces.ProduceCustomAdapter;
import com.app.simo.madt.R;
import com.app.simo.madt.RetrofitBuilder.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CategoryDetail extends AppCompatActivity implements Callback<CategoriesDetails> {
    int the_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        build();
    }

    public void build() {

        Bundle b = this.getIntent().getExtras();
        the_id = b.getInt("key");

        Retrofit retrofit = RetrofitBuilder.build();

        Endpoint endpoint = retrofit.create(Endpoint.class);

        Call<CategoriesDetails> call = endpoint.listCategoriesDetails(the_id);

        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<CategoriesDetails> call, Response<CategoriesDetails> response) {

        CategoriesDetails category = response.body();

        android.support.v7.app.ActionBar actionBar =getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(""+category.getName());
            actionBar.setSubtitle(""+category.getDescription());
        }

        ListView listViewProduce = (ListView) findViewById(R.id.listViewProduce);
        final ProduceCustomAdapter produceCustomAdapter = new ProduceCustomAdapter(CategoryDetail.this, R.layout.prodice_list_item, category.getProduces());
        listViewProduce.setAdapter(produceCustomAdapter);

        listViewProduce.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CategoryDetail.this, ProduceDetail.class);
                Produce produce = produceCustomAdapter.getItem(position);
                int identity = produce.getId();
                Bundle bundle = new Bundle();
                bundle.putInt("identity", identity);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onFailure(Call<CategoriesDetails> call, Throwable t) {
        Toast.makeText(getApplicationContext(), ""+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

    }
}
