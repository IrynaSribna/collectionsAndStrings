package com.ira.exer2;

/**
 * Created by Iryna on 2/28/15.
 */
public class Chair implements Furniture {

    private String color;

    private Double price;

    private Float weight;

    public Chair() {
        price = new Double(5);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }


}
