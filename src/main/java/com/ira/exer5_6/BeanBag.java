package com.ira.exer5_6;

/**
 * Created by Iryna on 2/28/15.
 */
public class BeanBag extends MagicBox {

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
        return 2.1f;
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

    public String getName() {
        return "Bean Bag";
    }
}
