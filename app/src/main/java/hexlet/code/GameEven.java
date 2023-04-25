package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println();
<<<<<<< HEAD
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
=======
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
>>>>>>> refs/remotes/origin/main
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i <= 2; i++) {
            int number = random.nextInt(100);
<<<<<<< HEAD
            System.out.println("Question: " + number);
=======
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            System.out.println("Your answer: ");
>>>>>>> refs/remotes/origin/main
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
<<<<<<< HEAD
                System.out.println("'" + answer + "'" + " is wrong answer. ;( " +
=======
                System.out.println("'" + answer + "'" + " is wrong answer. ;( " +
>>>>>>> refs/remotes/origin/main
                        "Correct answer was " + "'" + correctAnswer + "'" + ".\nLet's try again, " + userName + "!");
                break;

            }
            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
<<<<<<< HEAD
                scanner.close();
=======
                break;
                }
>>>>>>> refs/remotes/origin/main
            }
        }
    }
}
