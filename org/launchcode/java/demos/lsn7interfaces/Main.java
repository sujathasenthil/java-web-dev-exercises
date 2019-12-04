package org.launchcode.java.demos.lsn7interfaces;
import org.launchcode.java.demos.lsn7interfaces.FlavorComparator;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Case allItems = new Case();
        ArrayList<Flavor> flavors = allItems.getFlavors();
        ArrayList<Cone> cones = allItems.getCones();
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
            cones.sort(new ConeComparator());
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (int i=0; i<flavors.size(); i++)
            System.out.println(flavors.get(i).getName());
        for (int i=0; i<cones.size(); i++)
            System.out.println(cones.get(i).getName() + " : " +cones.get(i).getCost());

    }
}


