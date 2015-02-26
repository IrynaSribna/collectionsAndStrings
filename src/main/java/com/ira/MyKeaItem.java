package com.ira;

/**
 * Created by Iryna on 2/26/15.
 */
public class MyKeaItem {
    private String name;

    private Float price;

    private Float weight;

    public MyKeaItem() {

    }

    public MyKeaItem(String name, Float price, Float weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MyKeaItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
