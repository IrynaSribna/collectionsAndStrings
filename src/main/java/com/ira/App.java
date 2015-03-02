package com.ira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //exercise 1
        MyKeaItem []items = {new MyKeaItem("Chair", 45f, 4f),
                new MyKeaItem("Bean Bag", 80.99f, 1.2f),
                new MyKeaItem("Desk", 257.99f, 10.7f),
                new MyKeaItem("Table", 154.52f, 13f)
        };
        System.out.println("-------------Before sorting------------");
        System.out.println(Arrays.toString(items));

        System.out.println("------------Sorting by price-----------");
        Arrays.sort(items, new PriceComparator());
        System.out.println(Arrays.toString(items));

        System.out.println("--------------Sorting by weight----------");
        Arrays.sort(items, new WeightComparator());
        System.out.println(Arrays.toString(items));

        //exercise 2
        MyKeaItem chair = new MyKeaItem("Chair", 45f, 4f);
        MyKeaItem lamp = new MyKeaItem("Lamp", 21f, 0.6f);
        MyKeaItem plant = new MyKeaItem("Plant", 0.99f, 0.2f);
        MyKeaItem board = new MyKeaItem("Board", 155f, 7.4f);

        List<MyKeaItem> magicList1 = new ArrayList<MyKeaItem>();
        magicList1.add(chair);
        magicList1.add(plant);
        magicList1.add(board);

        MagicBoxNotGeneric magicBoxNotGeneric1 = new MagicBoxNotGeneric(magicList1);
        System.out.println("Total price: " + magicBoxNotGeneric1.getTotalPrice());
        System.out.println("Total weight: " + magicBoxNotGeneric1.getTotalWeight());

        //should fail
        magicList1.add(lamp);
        MagicBoxNotGeneric magicBoxNotGeneric2 = new MagicBoxNotGeneric(magicList1);
        System.out.println("test");
    }
}
