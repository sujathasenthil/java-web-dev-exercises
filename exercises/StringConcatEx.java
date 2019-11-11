package exercises;
import java.util.Scanner;

public class StringConcatEx {
    public static void main(String args[]){
    String aliceStory="Alice was beginning to get very tired of sitting by her sister on the bank," +
            " and of having nothing to do: once or twice she had peeped into the book her sister was " +
            "reading, but it had no pictures or conversations in it,'and what is the use of a book,'" +
            " thought Alice 'without pictures or conversation?'";
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a word to Search");
    String wordToSearch=input.nextLine();
    if(aliceStory.toLowerCase().contains(wordToSearch.toLowerCase()))
    {
        int indexOfSearch=(aliceStory.indexOf((wordToSearch.toLowerCase())));
        System.out.println("Search Term was Found at "+indexOfSearch + " with length of " + wordToSearch.length());
        String aliceStoryPart1=aliceStory.substring(0,indexOfSearch-1);
        String aliceStoryPart2=aliceStory.substring(indexOfSearch+wordToSearch.length(),aliceStory.length());
        System.out.println("Updated Story: ");
        System.out.println(aliceStoryPart1 + aliceStoryPart2);
    }
    else
        System.out.println("Search Term was not Found ");
    }
}
