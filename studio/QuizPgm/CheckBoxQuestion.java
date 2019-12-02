package studio.QuizPgm;

import java.util.HashMap;

public class CheckBoxQuestion extends Question {

    private HashMap<String, Boolean> checkAllThatApply = new HashMap();

    public CheckBoxQuestion(String questionString) {
        super(questionString);
    }

    public HashMap<String, Boolean> getCheckAllThatApply() {
        return checkAllThatApply;
    }

    public void setCheckAllThatApply(HashMap<String, Boolean> checkAllThatApply) {
        this.checkAllThatApply = checkAllThatApply;
    }

    public void check(String key) {
        this.checkAllThatApply.put(key, true);
    }

    public void uncheck(String key) {
        this.checkAllThatApply.put(key, false);
    }

    @Override
    public String getActualAnswer() {
        int actualAnswer = 0;
        for(String key:  checkAllThatApply.keySet()) {
            if (checkAllThatApply.get(key)) {
                actualAnswer += key.hashCode();
            }
        }
        return String.valueOf(actualAnswer);
    }

    public String hashcode(String[] keys) {
        int selected = 0;
        for (String key : keys) {
            selected += key.hashCode();
        }
        return String.valueOf(selected);
    }
}
