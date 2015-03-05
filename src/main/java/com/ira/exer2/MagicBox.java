package com.ira.exer2;

import java.util.List;

/**
 * Created by Iryna on 2/28/15.
 */
public class MagicBox<T> {

    List<? extends Furniture> items;

    public static int ALLOWED_SIZE = 3;



    public MagicBox(List<? extends Furniture> items) {
        if (items.size() > ALLOWED_SIZE) {
            throw new IllegalArgumentException("Too many items");
        }
        this.items = items;
    }

    public Double getTotalPrice() {
        Double price = 0.0;
        for (Furniture f : items) {
            price += f.getPrice();
        }

        return price;
    }

    public <T extends Furniture> T getItem(int position) {
        T item = (T) items.get(position);
        return item;
    }



}
