package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.TOTAL_ROUNDS;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    public static final String[] OPERATORS = {"+", "-", "*"};
    public static final int MAX_NUMBER = 10;

    public static void getCalculate() {

        String[][] data = new String[TOTAL_ROUNDS][2];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {

            int number1 = Utils.getRandomNumber(0, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(0, MAX_NUMBER);
            String operator = OPERATORS[Utils.getRandomNumber(0, OPERATORS.length)];
            data[i][0] = number1 + " " + operator + " " + number2;
            data[i][1] = String.valueOf(calculate(number1, number2, operator));
        }

        Engine.run(DESCRIPTION, data);
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
