package com.ira.exer2a;

import java.util.List;

/**
 * Created by iryna.sribna on 02.03.2015.
 */
public class LampMagicBox<T> {


    public Double getTotalPrice(List<? extends LampAbstract> lamps) {
        Double price = 0.0;
        for (LampAbstract lamp : lamps) {
            price += lamp.getPrice();
        }

        return price;
    }
}
