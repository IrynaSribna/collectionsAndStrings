package com.ira.exer5_6;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iryna.sribna on 03.03.2015.
 */
public class PrintUtility {

    public static void stockPrint(Map<String, List<?>> items) {
        printHeader();
        Set keys = items.keySet();
        Iterator iterator =  keys.iterator();
        while (iterator.hasNext()) {
            String desc = (String) iterator.next(); //key name
            List<MagicBox> magicBox = (List<MagicBox>) items.get(desc);
            System.out.printf("%-10s \t %3d \t\t %4.1f \t\t %4.1f \t\t %-25s \n", magicBox.get(0).getName(), magicBox.size(), magicBox.size()*magicBox.get(0).getWeight(), magicBox.size() * magicBox.get(0).getPrice(), desc);
        }
        printLine();

    }

    public static void searchResultPrint(String keyword, Map<String, List<?>> items) {
        printHeader();

        Set keys = items.keySet();
        Iterator iterator =  keys.iterator();
        Pattern pattern = Pattern.compile(keyword);

        while (iterator.hasNext()) {
            String desc = (String) iterator.next(); //key name
            Matcher matcher = pattern.matcher(desc);
            while (matcher.find()) {
                List<MagicBox> magicBox = (List<MagicBox>) items.get(desc);
                System.out.printf("%-10s \t %3d \t\t %4.1f \t\t %4.1f \t\t %-25s \n", magicBox.get(0).getName(), magicBox.size(), magicBox.size() * magicBox.get(0).getWeight(), magicBox.size() * magicBox.get(0).getPrice(), desc);
            }
        }
        printLine();

    }

    private static void printHeader() {
        printLine();
        System.out.printf("%-10s \t %s \t %s \t %s \t\t %-20s \n", "Item Name", "Amount", "Weight", "Price", "Description");
        printLine();
    }

    private static void printLine() {
        System.out.println("-------------------------------------------------------------------------------");
    }
}
