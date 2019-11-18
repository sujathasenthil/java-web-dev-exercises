package studio.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantPgm {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        MenuItem menuItem1 = new MenuItem("Chicken Briyani", 12.99, "Chicken Flavoured Rice", "Main Course", new Date());
        menuItems.add(menuItem1);
        MenuItem menuItem2 = new MenuItem("Hash Browns", 3.99, "small potato nudgets", "Appetizer", new Date());
        menuItems.add(menuItem2);
        menu.setMenuItems(menuItems);
        System.out.println(menu);
    }
}