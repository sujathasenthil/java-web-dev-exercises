package studio.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private ArrayList<MenuItem> menuItems= new ArrayList<>();
    private Date modifiedDate;
    public void addItem(MenuItem aItem){
        menuItems.add(aItem);
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }
    public void removeItem(MenuItem item){
        this.menuItems.remove(item);
    }
    @Override
    public String toString() {
        return "Today's Menu{" +
                "MenuItems=" + menuItems +
                '}';
    }
}
