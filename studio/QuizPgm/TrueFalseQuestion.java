package studio.QuizPgm;

public class TrueFalseQuestion extends Question {

    private char actualAnswer;

    public String getActualAnswer() {
        return actualAnswer + "";
    }

    public void setActualAnswer(char actualAnswer) {
        this.actualAnswer = actualAnswer;
    }

    public TrueFalseQuestion(String questionString) {
        super(questionString);
    }
}
