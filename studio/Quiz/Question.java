package studio.Quiz;

public abstract class Question {
        private final String text;
        public String choiceString="";
     //   public Boolean isTrue;

        public Question(String text)  { this.text = text; }
        public abstract boolean checkAnswer(String answer);
        public String getText() { return text; }
        public void display() {
            System.out.println(getText());
        }
    }
