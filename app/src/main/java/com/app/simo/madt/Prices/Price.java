package com.app.simo.madt.Prices;

import com.app.simo.madt.Farmers.Farmer;
import com.app.simo.madt.Markets.Market;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("produce_id")
    @Expose
    private String produceId;
    @SerializedName("farmer_id")
    @Expose
    private String farmerId;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("market_id")
    @Expose
    private String marketId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("market")
    @Expose
    private Market market;
    @SerializedName("farmer")
    @Expose
    private Farmer farmer;

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
     * The produceId
     */
    public String getProduceId() {
        return produceId;
    }

    /**
     *
     * @param produceId
     * The produce_id
     */
    public void setProduceId(String produceId) {
        this.produceId = produceId;
    }

    /**
     *
     * @return
     * The farmerId
     */
    public String getFarmerId() {
        return farmerId;
    }

    /**
     *
     * @param farmerId
     * The farmer_id
     */
    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    /**
     *
     * @return
     * The price
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The marketId
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     *
     * @param marketId
     * The market_id
     */
    public void setMarketId(String marketId) {
        this.marketId = marketId;
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
     * The market
     */
    public Market getMarket() {
        return market;
    }

    /**
     *
     * @param market
     * The market
     */
    public void setMarket(Market market) {
        this.market = market;
    }

    /**
     *
     * @return
     * The farmer
     */
    public Farmer getFarmer() {
        return farmer;
    }

    /**
     *
     * @param farmer
     * The farmer
     */
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

}