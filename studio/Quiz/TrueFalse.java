package studio.Quiz;

import studio.Quiz.Question;

import java.util.ArrayList;
import java.util.List;

public class TrueFalse extends Question {
    int correctAnswer;
    public TrueFalse(String questionText, Boolean isTrue) {
        super(questionText);
        //this.isTrue= isTrue;
    }
    public void addChoice(String choice, boolean isTrue) {
            if (isTrue && answer.equalsIgnoreCase("true"))
                return true;
            if (!isTrue && answer.equals("false"))
            return true;//            count++;
//           // String choiceString;
//            if(correct){
//                choiceString = choiceString+ "" + count;
//                choices.add(choiceString);
//            }

    }
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
    public void addChoice(String choice, boolean correct) {

    }

    public void display() {
        System.out.println(getText());
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ": " + choices.get(i));
        }

    }
}
