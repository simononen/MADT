package com.app.simo.madt.Interface;


import com.app.simo.madt.Categories.Category;
import com.app.simo.madt.Produces.Produce;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Endpoint {
    @GET("/categories")
    Call<List<Category>> listCategories();

    @GET("/produces")
    Call<Produce> listProduce(@Query("sort") String order);
}
