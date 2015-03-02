package com.ira.exer2;

/**
 * Created by Iryna on 2/28/15.
 */
public class BeanBag {

    private String color;

    private Double price;

    private Float weight;

    private String material;

    public BeanBag() {
        price = new Double(33);
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
