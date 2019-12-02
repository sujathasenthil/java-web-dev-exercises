package studio.Quiz;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args)
    {
        int questionCount=0;
        int correctCount=0;
        ArrayList<Question> quiz= new ArrayList<Question>();
        MultipleChoice question1 = new MultipleChoice("Can we have two main methods in java class");
        question1.addChoice("Yes", true);
        question1.addChoice("No", false);
        MultipleChoice question2 = new MultipleChoice("select all primitive data types in java");
        question2.addChoice("int",true);
        question2.addChoice("object",false);
        question2.addChoice("character",false);
        question2.addChoice("String",false);
        TrueFalse TrueFalse1 = new TrueFalse( "Constructor can be inherited?");
         TrueFalse1.addChoice("True",false);
         TrueFalse1.addChoice("False",true);
        // TrueFalse2.addChoice = new TrueFalse( "Constructor overloading is not possible in Java");

        // All choices questions

      /*  CheckBox allChoiceQuestion1 = new allChoiceQuestion1("Which of the basic data type(s) has the size of 16 bit?");
        allChoiceQuestion1.addChoice("Char", true);
        allChoiceQuestion1.addChoice("Short", true);
        allChoiceQuestion1.addChoice("Float", false);
        allChoiceQuestion1.addChoice("Double", false);
*/
        // Add questions to the quiz
        quiz.add(question1);
        quiz.add(question2);
        quiz.add(TrueFalse1);
        Scanner in = new Scanner(System.in);
        for (Question q : quiz)
        {
           q.display();
           System.out.print("Your answer: ");
           // remove all of whitespaces at the begning and end of user input
           String response = in.nextLine().trim();
            if(q.checkAnswer(response) == true){
                 correctCount++;}
            System.out.println(q.checkAnswer(response));
            questionCount++;
          }
        System.out.println("Yon Answered " + correctCount + " of "+questionCount +" questions correctly.");
        // print the quiz result in percentage format
        System.out.println("Score: " + (((double)correctCount/(double)(questionCount))*100) + "%");
    }
}
