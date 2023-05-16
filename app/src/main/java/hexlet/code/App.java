package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Game Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            System.out.println("Your choice: " + number);

        switch (number) {
            default:
                System.out.println("See u!");
                break;
            case (0):
                break;
            case (1):
                Cli.greeting();
                break;
            case (2):
                Even.even();
                break;
            case (3):
                Calc.script();
                break;
            case (4):
                GCD.getCgd();
                break;
            case (5):
                Progression.generateProgression();
                break;
            case (6):
                Prime.primeGame();
                break;
        }
    }
}
