package exercises;
import java.util.Scanner;
public class MilesPerHr {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many miles you drive so far?");
        double milesDriven=input.nextDouble();
        System.out.println("Enter amount of gas consumed?");
        double gasUsed=input.nextDouble();
        System.out.println("Miles per Gallon="+(milesDriven/gasUsed));
    }
}
