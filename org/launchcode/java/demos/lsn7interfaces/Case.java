package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Case {
    private ArrayList<org.launchcode.java.demos.lsn7interfaces.Flavor> flavors = new ArrayList<>();
    private ArrayList<org.launchcode.java.demos.lsn7interfaces.Cone> cones = new ArrayList<>();

    public Case(){
        org.launchcode.java.demos.lsn7interfaces.Cone cone1 = new org.launchcode.java.demos.lsn7interfaces.Cone("Waffle", 1.25, new ArrayList<>(Arrays.asList( "gluten")));
        org.launchcode.java.demos.lsn7interfaces.Cone cone2 = new org.launchcode.java.demos.lsn7interfaces.Cone("Sugar", 0.75, new ArrayList<>(Arrays.asList( "gluten")));
        org.launchcode.java.demos.lsn7interfaces.Cone cone3 = new org.launchcode.java.demos.lsn7interfaces.Cone("Wafer", 0.50, new ArrayList<>(Arrays.asList( "gluten")));
        org.launchcode.java.demos.lsn7interfaces.Cone cone4 = new org.launchcode.java.demos.lsn7interfaces.Cone("Bowl", 0.05, new ArrayList<>(Arrays.asList( "none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        org.launchcode.java.demos.lsn7interfaces.Flavor flavor1 = new org.launchcode.java.demos.lsn7interfaces.Flavor("Vanilla", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        org.launchcode.java.demos.lsn7interfaces.Flavor flavor2 = new org.launchcode.java.demos.lsn7interfaces.Flavor("Chocolate", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        org.launchcode.java.demos.lsn7interfaces.Flavor flavor3 = new org.launchcode.java.demos.lsn7interfaces.Flavor("Red Velvet", 0.85, new ArrayList<>(Arrays.asList( "dairy", "red #5")));
        org.launchcode.java.demos.lsn7interfaces.Flavor flavor4 = new org.launchcode.java.demos.lsn7interfaces.Flavor("Rocky Road", 0.85, new ArrayList<>(Arrays.asList( "dairy", "nuts", "gelatin")));
        org.launchcode.java.demos.lsn7interfaces.Flavor flavor5 = new org.launchcode.java.demos.lsn7interfaces.Flavor("Strawberry Sorbet", 0.50, new ArrayList<>(Arrays.asList( "strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);
    }

    public ArrayList<org.launchcode.java.demos.lsn7interfaces.Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<org.launchcode.java.demos.lsn7interfaces.Cone> getCones() {
        return cones;
    }

    public void setFlavors(ArrayList<org.launchcode.java.demos.lsn7interfaces.Flavor> flavors) {
        this.flavors = flavors;
    }

    public void setCones(ArrayList<org.launchcode.java.demos.lsn7interfaces.Cone> cones) {
        this.cones = cones;
    }
}
