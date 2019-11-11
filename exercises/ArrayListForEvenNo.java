package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForEvenNo {
    public static void main(String args[])
    {
        int[] numArray={1, 1, 2, 3, 5, 8,3,2,6,4};
        ArrayList<Integer> intValues = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int val: numArray) {
            intValues.add(val);
        }
        System.out.println("Sum of Even numbers : "+ addEven(intValues));
    }
    static int addEven(ArrayList<Integer> arrayInt){
        int sum=0;
        for(int no : arrayInt){
            if(no%2 == 0)
                sum+=no;
        }
        return sum;
    }
}
