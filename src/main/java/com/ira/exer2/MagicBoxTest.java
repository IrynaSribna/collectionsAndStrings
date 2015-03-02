package com.ira.exer2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Iryna on 2/28/15.
 */
public class MagicBoxTest {

    public static void main(String[] args) {
        List items = new LinkedList<>(); //works only in Java 7
        items.add(new Chair());
        items.add(new Lamp());
        items.add(new BeanBag());

        MagicBox magicBox = new MagicBox(items);

        System.out.printf("Total price: ");
        System.out.println(magicBox.getTotalPrice());

        //exception
        List newItems = new LinkedList<>();
        newItems.add(new Lamp());
        newItems.add(new Board());
        newItems.add(new Table());

        MagicBox magicBox1 = new MagicBox(newItems);

        System.out.println(magicBox1.getTotalPrice());

    }
}
