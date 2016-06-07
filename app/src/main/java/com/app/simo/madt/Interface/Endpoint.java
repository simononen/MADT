package com.app.simo.madt.Interface;


import com.app.simo.madt.Categories.Category;
import com.app.simo.madt.CategoryDetails.CategoriesDetails;
import com.app.simo.madt.ProduceDetails.ProduceDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Endpoint {
    @GET("/categories")
    Call<List<Category>> listCategories();

    @GET("/categories/{id}")
    Call<CategoriesDetails> listCategoriesDetails(@Path("id") int id);

    @GET("/produces/{id}")
    Call<ProduceDetails> listProduce(@Path("id") int id);
}
