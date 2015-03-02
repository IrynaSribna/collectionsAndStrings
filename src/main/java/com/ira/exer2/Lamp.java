package com.ira.exer2;

/**
 * Created by Iryna on 2/28/15.
 */
public class Lamp {

    private Double price;

    private String type;

    private Float weight;

    public Lamp() {
        price = new Double(12);
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
