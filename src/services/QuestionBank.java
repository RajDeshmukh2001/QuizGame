package services;

import model.MCQQuestion;
import model.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private List<Question> questions = new ArrayList<>();

    public QuestionBank() {
        questions.add(new MCQQuestion(
                "What is the capital of India?",
                List.of("Delhi", "Mumbai", "Chennai", "Kolkata"),
                "Delhi"
        ));

        questions.add(new MCQQuestion(
                "Which language is used for Android development?",
                List.of("Python", "Java", "C++", "PHP"),
                "Java"
        ));

        questions.add(new MCQQuestion(
                "Which concept is used to hide data in OOP?",
                List.of("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
                "Encapsulation"
        ));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
