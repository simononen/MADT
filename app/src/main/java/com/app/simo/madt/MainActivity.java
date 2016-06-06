package com.app.simo.madt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.app.simo.madt.Categories.Category;
import com.app.simo.madt.Categories.CategoryAdapter;
import com.app.simo.madt.Interface.Endpoint;
import com.app.simo.madt.RetrofitBuilder.RetrofitBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements Callback<List<Category>>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        builder();

    }

    public void builder() {

        Retrofit retrofit = RetrofitBuilder.build();

        Endpoint endpoint = retrofit.create(Endpoint.class);

        Call<List<Category>> call = endpoint.listCategories();

        call.enqueue(MainActivity.this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {

        ArrayList<Category> c = (ArrayList<Category>) response.body();
        ListView listView = (ListView) findViewById(R.id.list);
        //CategoryAdapter adapter = new CategoryAdapter(this, R.layout.category_list_item, c.);
        //listView.setAdapter(adapter);

        CategoryAdapter adapter = new CategoryAdapter(this, R.layout.category_list_item, c);
        listView.setAdapter(adapter);

        TextView tvprice = (TextView) findViewById(R.id.category);

        //tvprice.setText(c.getName());


        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();


    }

    @Override
    public void onFailure(Call<List<Category>> call, Throwable t) {
        Toast.makeText(getApplicationContext(), "Failed"+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

    }
}
