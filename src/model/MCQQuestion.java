package model;

public class MCQQuestion extends Question {
    private String[] options;

    public MCQQuestion(String questionText, String[] options, String correctAnswer) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    @Override
    public void displayOptions() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}
