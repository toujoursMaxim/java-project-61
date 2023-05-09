package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_ROUNDS = 3;
    public static final int ANSWERS_COUNT = 2;

    public static void run(String gameCount, String[][] questionsAndAnswers) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameCount);

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            String question = questionsAndAnswers[i][0];
            String answer = questionsAndAnswers[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + answer + "'" + ".\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
