package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String args[]){
        ArrayList<String> arrayValues = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newValue;

        System.out.println("Enter s value (or ENTER to finish):");
        do {
            newValue = input.nextLine();

            if (!newValue.equals("")) {
                arrayValues.add(newValue);
            }

        } while(!newValue.equals(""));
        for(String item: arrayValues){
            if(item.length() == 5)
            {
                System.out.print(item);
                System.out.println(" is of length 5");
            }

        }
    }
}
