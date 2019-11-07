package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(String radius) {
       double rad=new Double(radius);
        double pi=3.14;
        return pi * rad * rad;
    }
}
