package exercises;

import java.util.Scanner;

public class AreaOfRectangle{

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        double recLength=input.nextDouble();
        System.out.println("Enter the width of rectangle:");
        double recWidth=input.nextDouble();
        double recArea=recLength*recWidth;
        System.out.println("Area Of Rectangle ="+recArea);
    }

}
