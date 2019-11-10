package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    static boolean isNumber(String convert)
    {
       // String convert =Double.toString(s);
        for (int i = 0; i < convert.length(); i++)
        {
            if (!Character.isDigit(convert.charAt(i)))
                return false;
        }
        return true;
    }
    static boolean isNegative(String val)
    {
        boolean isItNumber=isNumber(val);
        if(isItNumber)
        {
            double value=new Double(val);
            if(value < 0)
                return true;
            else
                return false;

        }
        else
            return true;

    }
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String radius;
    do{
        System.out.println("Enter a radius:");
        radius=input.nextLine();
    }while((isNegative(radius))||(!isNumber(radius)) || (radius==""));
    System.out.println("The area of a circle of radius "+ radius + " is "+ Circle.getArea(radius) );
    }
}

/*
 try
    {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException ex)
    {
        return false;
    }
 */