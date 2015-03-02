package com.ira.exer5;


import java.util.*;

/**
 * Created by Iryna on 3/2/15.
 */
public class Stock<T> {

    public static void main(String[] args) {
        Map<String, List<?>> availableItems = new HashMap<>();

        List<Chair> chairs = new LinkedList<Chair>();
        for (int i = 0; i < 10; i++) {
            chairs.add(new Chair());
        }

        List<BeanBag> beanBags = new LinkedList<BeanBag>();
        beanBags.add(new BeanBag());
        beanBags.add(new BeanBag());
        beanBags.add(new BeanBag());

        List<Table> tables = new LinkedList<Table>();
        for (int i = 0; i < 10; i++) {
            tables.add(new Table());
        }

        availableItems.put("Chair desc", chairs);
        availableItems.put("BeanBag desc", beanBags);
        availableItems.put("Tables desc", tables);

        stockPrint(availableItems);

    }

    private static void stockPrint(Map<String, List<?>> availableItems) {
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%s \t %s \t %s \t %s \t %-20s \n", "Item Name", "Amount", "Weight", "Price", "Description");
        System.out.println("-----------------------------------------------------------");
        //for (int i = 0; i < availableItems.size(); i++)
        Set keys = availableItems.keySet();
        Collection<List<?>> values = availableItems.values();
        List<?> objects = availableItems.get(keys.iterator().next());
        //keys.
        //System.out.printf("%s \t %d \t\t %d \t\t %d \t\t %-20s \n", availableItems.values(keys.iterator().));
    }

}
