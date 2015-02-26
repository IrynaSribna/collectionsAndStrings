package com.ira;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Iryna on 2/26/15.
 */
public class MagicBox {

    private static final int ALLOWED_SIZE = 3;

    private List<MyKeaItem> items;

    private Float totalPrice;

    private Float totalWeight;

    public List<MyKeaItem> getItems() {
        return items;
    }

    public void setItems(List<MyKeaItem> items) {
        if (items.size() == ALLOWED_SIZE) {
            this.items = items;
        } else {
            throw new IllegalArgumentException("Magic box size can contain only " + ALLOWED_SIZE + " items");
        }
    }

    public MagicBox(List<MyKeaItem> items) {
        setItems(items);
    }

    public Float getTotalPrice() {
        totalPrice = 0f;
        for (MyKeaItem item : items) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public Float getTotalWeight() {
        totalWeight = 0f;
        for (MyKeaItem item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }
}
