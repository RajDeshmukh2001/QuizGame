import model.Player;
import services.QuestionBank;
import services.Quiz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        QuestionBank questionBank = new QuestionBank();

        Quiz quizGame = new Quiz(player, questionBank.getQuestions());
        quizGame.start();
    }
}
