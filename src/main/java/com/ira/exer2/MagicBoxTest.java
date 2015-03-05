package com.ira.exer2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Iryna on 2/28/15.
 */
public class MagicBoxTest {

    public static void main(String[] args) {
        List<Furniture> furniture = new LinkedList<>();
        furniture.add(new MyLamp());
        furniture.add(new Chair());
        furniture.add(new BeanBag());

        MagicBox<Furniture> items = new MagicBox<>(furniture);

        System.out.printf("Total price: ");
        System.out.println(items.getTotalPrice());

        Furniture item = items.getItem(0);



        System.out.println(item);

    }
}
