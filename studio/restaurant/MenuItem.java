package studio.restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String desription;
    private String category;
    private Date modifiedDate;

    public MenuItem(String aName, double aPrice, String aDesc,String aCategory, Date aModifiedDate){
        this.name=aName;
        this.price=aPrice;
        this.desription=aDesc;
        this.category=aCategory;
        this.modifiedDate= aModifiedDate;
    }
    public MenuItem(String aName, double aPrice, String aCategory, Date aModifiedDate){
        this.name=aName;
        this.price=aPrice;
        this.desription="";
        this.category=aCategory;
        this.modifiedDate= aModifiedDate;
    }
    public String getName(){
        return name;
    }
    public void setName(String aName){
        name=aName;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String acategory) {
        this.category = acategory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double aprice) {
        this.price = aprice;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date aModifiedDate) {
        this.modifiedDate=aModifiedDate;
    }

    @Override
    public String toString() {
        return "\n {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desription='" + desription + '\'' +
                ", category='" + category + '\'' +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
   }

