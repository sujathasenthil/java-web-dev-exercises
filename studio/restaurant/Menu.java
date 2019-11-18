package studio.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Menu {
    private final String id = UUID.randomUUID().toString();
    private String name;
//    private ArrayList<MenuItem> menuItems;
   private ArrayList<MenuItem> menuItems= new ArrayList<>();
    private Date modifiedDate;
    public void addItem(MenuItem aItem){
        menuItems.add(aItem);
     //   this.modifiedDate=modifiedDate;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public ArrayList<MenuItem> getMenuItems(){
  //  public ArrayList<String> getMenuItems() {
//        ArrayList<String> menuItems=new ArrayList<>();
//        for(MenuItem menulist:this.menuItems){
//            String itemlisted="";
//            itemlisted += menulist.getName() + "     ";
//            System.out.println(itemlisted);
//            itemlisted += menulist.getCategory() + "     ";
//            System.out.println(itemlisted);
//            itemlisted += menulist.getPrice();
//            System.out.println(itemlisted);
//            menuItems.add(itemlisted);
//            System.out.println(menuItems);
      //  }
        return menuItems;
    }
    public void removeItem(MenuItem item){
        this.menuItems.remove(item);
    //    this.modifiedDate=modifiedDate;
    }
    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
