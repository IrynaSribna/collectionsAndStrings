package com.ira.exer5_6;

/**
 * Created by Iryna on 2/28/15.
 */
public class Table extends MagicBox {

    private Float height;

    private Float bright;

    private String woodType;

    private Double price;

    private Float weight;

    public Double getPrice() {
        return 125.6;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Float getWeight() {
        return 10.4f;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public Float getBright() {
        return bright;
    }

    public void setBright(Float bright) {
        this.bright = bright;
    }

    public String getName() {
        return "Table";
    }
}
