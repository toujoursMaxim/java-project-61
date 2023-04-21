package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
<<<<<<< HEAD
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
=======
>>>>>>> refs/remotes/origin/main
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i <= 2; i++) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);

<<<<<<< HEAD
            System.out.print("Your answer: ");
=======
            System.out.println("Your answer: ");
>>>>>>> refs/remotes/origin/main
            String answer = scanner.nextLine();
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer. ;( " +
<<<<<<< HEAD
                        "Correct answer was " + "'" + correctAnswer + "'" + ".\nLet's try again, " + userName + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
=======
                        "Correct answer was " + "'" + correctAnswer + "'" + ".\nLet's try again!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations!");
>>>>>>> refs/remotes/origin/main
            }
        }
    }
}
