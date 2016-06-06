package com.app.simo.madt.Produces;

import com.app.simo.madt.Categories.Category;
import com.app.simo.madt.Prices.Price;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Produce {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("prices")
    @Expose
    private List<Price> prices = new ArrayList<Price>();
    @SerializedName("farmer")
    @Expose
    private Object farmer;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     *
     * @param categoryId
     * The category_id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     * The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The prices
     */
    public List<Price> getPrices() {
        return prices;
    }

    /**
     *
     * @param prices
     * The prices
     */
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     *
     * @return
     * The farmer
     */
    public Object getFarmer() {
        return farmer;
    }

    /**
     *
     * @param farmer
     * The farmer
     */
    public void setFarmer(Object farmer) {
        this.farmer = farmer;
    }

}