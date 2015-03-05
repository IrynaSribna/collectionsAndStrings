package com.ira.exer5_6;


import java.util.*;

/**
 * Created by Iryna on 3/2/15.
 */
public class Stock {

    public static void main(String[] args) {
        Map<String, List<?>> availableItems = new HashMap<>();

        List<MagicBox> chairs = new LinkedList<MagicBox>();
        for (int i = 0; i < 10; i++) {
            chairs.add(new Chair());
        }

        List<MagicBox> beanBags = new LinkedList<MagicBox>();
        beanBags.add(new BeanBag());
        beanBags.add(new BeanBag());
        beanBags.add(new BeanBag());

        List<MagicBox> tables = new LinkedList<MagicBox>();
        for (int i = 0; i < 7; i++) {
            tables.add(new Table());
        }

        availableItems.put("Special chair with 4 legs", chairs);
        availableItems.put("Hugh bag full of beans inside", beanBags);
        availableItems.put("Brown table with 4 legs", tables);


        System.out.println("Current stock state:");
        PrintUtility.stockPrint(availableItems);

        System.out.println();
        String keyword = "table";
        System.out.println("Results of search inside the Description by keyword: " + keyword);
        PrintUtility.searchResultPrint(keyword, availableItems);

    }

}
