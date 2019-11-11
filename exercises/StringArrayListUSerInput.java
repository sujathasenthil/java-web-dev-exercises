package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayListUSerInput {
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
        System.out.println("Enter the word size u want to searchc: ");
        int size=input.nextInt();
        for(String item: arrayValues){
            if(item.length() == size)
            {
                System.out.print(item);
                System.out.println(" is of length "+size);
            }

        }
    }
}
