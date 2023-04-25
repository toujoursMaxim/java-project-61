package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Game Even
        3 - Calc
        0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Your choice: " + number);
        switch (number) {
            case (0):
                break;
            case (1):
                Cli.greeting();
                break;
            case (2):
                GameEven.even();
                break;
            case (3):
                //Calc();
                break;
        }
    }
}
