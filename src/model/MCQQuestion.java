package model;

import java.util.List;

public class MCQQuestion extends Question {
    private List<String> options;

    public MCQQuestion(String questionText, List<String> options, String correctAnswer) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    @Override
    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }
}
