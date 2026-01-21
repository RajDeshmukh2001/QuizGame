package services;

import model.Player;
import model.Question;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    private Player player;
    private List<Question> questions;

    public Quiz(Player player, List<Question> questions) {
        this.player = player;
        this.questions = questions;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Quiz Started ---\n");

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            question.displayOptions();

            System.out.print("Enter your answer: ");
            String answer = scanner.nextLine();

            if (question.checkAnswer(answer)) {
                System.out.println("Correct!\n");
                player.increaseScore();
            } else {
                System.out.println("Wrong answer!\n");
            }
        }

        System.out.println("--- Quiz Finished ---");
        System.out.println(player.getName() + ", your score is: " + player.getScore());
    }
}
