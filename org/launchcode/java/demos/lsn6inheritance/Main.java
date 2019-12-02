import org.launchcode.java.demos.lsn6inheritance.HouseCat;

class Main{
    public static void main(String args[])
    {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println("IS Tired: " +garfield.isTired());   // prints true
        System.out.println("Purr: " +garfield.purr());
        System.out.println("Noise: "+garfield.noise());
        System.out.println("Is Satisfied: " +garfield.isSatisfied());
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13
    }
}
