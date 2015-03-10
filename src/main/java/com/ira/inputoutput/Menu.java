package com.ira.inputoutput;

import com.ira.exer5_6.*;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

/**
 * Created by Iryna on 3/10/15.
 */
public class Menu {
    private Map<String, List<?>> availableItems;
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.checkCredentials();
        menu.prepareStock();
        menu.printMenu();
        String userInput;
        Scanner scanIn = new Scanner(System.in);
        while (true) {
            userInput = scanIn.nextLine();

            switch (userInput) {
                case "1":
                    menu.displayStock();
                    break;
                case "2":
                    System.out.println("Please enter the keyword2");
                    userInput = scanIn.nextLine();
                    menu.searchByKeyword(userInput);
                    break;
                case "3":
                    System.out.println("The application is stopped...");
                    scanIn.close();
                    System.exit(1);
                default:
                    System.out.println("Please enter 1, 2 or 3");
                    break;

            }
        }

    }

    private void checkCredentials() {
        System.out.println("Check for password");
        System.out.println("Test");
        ClearUtility.clearConsole();
    }

    private void printMenu() {
        System.out.println("Enter 1 to get the list of items in stock");
        System.out.println("Enter 2 to search an item by keyword");
        System.out.println("Enter 3 to exit the application");
    }

    private void searchByKeyword(String keyword) {
        PrintUtility.searchResultPrint(keyword, availableItems);
    }

    private void displayStock() {
        PrintUtility.stockPrint(availableItems);
    }

    public void prepareStock() {
        availableItems = new HashMap<>();

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
    }
}
