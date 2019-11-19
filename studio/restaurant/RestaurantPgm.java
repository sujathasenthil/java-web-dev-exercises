package studio.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RestaurantPgm {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        String name;
        double price;
        String description;
        String category;
        java.util.Date date = new java.util.Date();
        MenuItem menuItem1 = new MenuItem("Chicken Briyani", 12.99, "Chicken Flavoured Rice", "Main Course", new Date());
        menuItems.add(menuItem1);
        MenuItem menuItem2 = new MenuItem("Hash Browns", 3.99, "small potato nudgets", "Appetizer", new Date());
        menuItems.add(menuItem2);
        MenuItem menuItem3 = new MenuItem("Pasta", 3.99, "mozeralla cheese over pasta", "Main Course", new Date());
        menuItems.add(menuItem3);
        MenuItem menuItem4 = new MenuItem("Mango Lassi", 1.99, "Mango smoothie", "Dessert", new Date());
        menuItems.add(menuItem4);
        MenuItem menuItem5 = new MenuItem("Chicken Noodles", 6.99, "Noodles with Chicken", "Main Course", new Date());
        menuItems.add(menuItem5);
        menu.setMenuItems(menuItems);
        while (true) {
            System.out.println("Please select an option");
            System.out.println("1)Add MenuItem");
            System.out.println("2)Remove MenuItem");
            System.out.println("3)Print Entire Menu");
            System.out.println("4)Print chosen individual Menu");
            System.out.println("5)Exit program");
            int menuChoice = input.nextInt();
            input.nextLine();
            while (menuChoice < 1 || menuChoice > 5) {
                System.out.println("Invalid entry please try again");
                menuChoice = input.nextInt();
                input.nextLine();
            }

            if (menuChoice == 1) {
                System.out.println("Enter a menu Name");
                name = input.nextLine();
                System.out.println("What is the price of " + name + "?");
                price = input.nextDouble();
                input.nextLine();
                System.out.println("can u give description of " + name + "?");
                description = input.nextLine();
                System.out.println(name + " goes under what category ?");
                category = input.nextLine();
                MenuItem newMenu = new MenuItem(name, price, description, category, date);
                menuItems.add(newMenu);
                menu.setMenuItems(menuItems);
                System.out.println("New Menu is Added");
            }
            if (menuChoice == 2) {
                System.out.println("Enter the menu name to remove");
                String itemToRemove = input.nextLine();
                for (MenuItem item : menuItems) {
                    if ((item.getName()).toLowerCase().equals(itemToRemove.toLowerCase())) {
                        menuItems.remove(item);
                        System.out.println("Ur selected Menu is Removed");
                        break;
                    }
                }
              //  System.out.println(menuItems);
            }
            if (menuChoice == 3) {
                System.out.println((menu));
            }
            if (menuChoice == 4) {
                System.out.println("Enter the menu to display");
                String itemToDisplay = input.nextLine();
                for (MenuItem item : menuItems) {
                    if ((item.getName()).toLowerCase().contains(itemToDisplay.toLowerCase())) {
                        System.out.println(item);
                    }
                }
            }
            if (menuChoice == 5) {
                System.exit(0);
            }


        }
    }
}