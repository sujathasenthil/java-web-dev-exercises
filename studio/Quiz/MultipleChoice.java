package studio.Quiz;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice extends Question {
        private List<String> choices;
        private int correctAnswer;
        public int count=0;
        public MultipleChoice(String questionText) {
            super(questionText);
            choices = new ArrayList<String>();
         }
        public void addChoice(String choice, boolean correct) {
            if (correct) { correctAnswer = choices.size(); }
            choices.add(choice);
//            count++;
//           // String choiceString;
//            if(correct){
//                choiceString = choiceString+ "" + count;
//                choices.add(choiceString);
//            }

        }
        public boolean checkAnswer(String answer) {
            return answer.equalsIgnoreCase(choices.get(correctAnswer));
         }
        public void display() {
            System.out.println(getText());
            for (int i = 0; i < choices.size(); i++) {
                System.out.println((i+1) + ": " + choices.get(i));
            }
        }
    }