package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import java.util.Scanner;

public class App {
    private static final int GOODBYE = 0;
    private static final int GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

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
        int gameNumber = scanner.nextInt();
            System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case GOODBYE -> System.out.println("Goodbye!");
            case GREET -> Cli.greeting();
            case GAME_EVEN -> Even.even();
            case CALC -> Calc.getCalculate();
            case GCD_GAME -> GCD.getGcd();
            case PROGRESSION -> Progression.generateProgression();
            case PRIME -> Prime.primeGame();
            default -> System.out.println("No game " + gameNumber + " found");
        }
    }
}
