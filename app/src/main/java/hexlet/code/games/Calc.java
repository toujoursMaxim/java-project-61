package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.TOTAL_ROUNDS;

public class Calc {
    private static final String GAME_TASK = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int MAX_NUMBER = 10;

    public static void startCalcGame() {
        Engine.run(GAME_TASK, calculatorGame());
    }

    private static String[][] calculatorGame() {

        String[][] questionsAndAnswers = new String[TOTAL_ROUNDS][2];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {

            int number1 = Utils.getRandomNumber(0, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(0, MAX_NUMBER);
            String operator = OPERATORS[Utils.getRandomNumber(0, OPERATORS.length)];
            questionsAndAnswers[i][0] = number1 + " " + operator + " " + number2;
            questionsAndAnswers[i][1] = String.valueOf(calculate(number1, number2, operator));
        }
        return questionsAndAnswers;
    }

    private static int calculate(int num1, int num2, String operator) {

        return switch (operator) {
            case ("+") -> num1 + num2;
            case ("-") -> num1 - num2;
            case ("*") -> num1 * num2;
            default -> throw new RuntimeException("Unknown operator " + operator);
        };
    }
}
