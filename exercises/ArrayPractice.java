package exercises;

public class ArrayPractice {
   // int[] numArray = new int[6];
    public static void main(String args[])
    {
        int[] numArray={1, 1, 2, 3, 5, 8};
        for(int i =0; i< numArray.length; i++){
            if(i%2 != 0)
                System.out.println("Odd Numbers :"+i);
        }
    }

}
