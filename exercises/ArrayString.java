package exercises;

import java.util.Arrays;

public class ArrayString {
    public static void main(String args[])
    {

        int arraySize = 50;
        String text=" I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] textArray= text.split("\\W+");
        String[] tempArray= new String[arraySize];
        int i=0;
        for (String temp: textArray){
            tempArray[i]=temp;
            i++;
        }
        System.out.println(Arrays.toString(tempArray));
    }
}
