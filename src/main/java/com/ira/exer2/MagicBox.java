package com.ira.exer2;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Iryna on 2/28/15.
 */
public class MagicBox<T> {

    public List<T> items;

    private Double price;

    public MagicBox(List<T> items) {
        this.items = items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Double getTotalPrice() {
        price = new Double(0);
        Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Chair) {
                price += ((Chair) o).getPrice();
            } else if (o instanceof  BeanBag) {
                price += ((BeanBag) o).getPrice();
            } else if (o instanceof Lamp) {
                price += ((Lamp) o).getPrice();
            } else if (o instanceof Table) {
                price += ((Table) o).getPrice();
            } else {
                throw new IllegalArgumentException("Unexpected item!");
            }

        }
        return price;
    }


}
