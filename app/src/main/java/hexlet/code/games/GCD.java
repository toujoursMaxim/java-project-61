package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.TOTAL_ROUNDS;

public class GCD {
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final int ANSWERS_ARRAY_SIZE = 2;
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static void getGcd() {
        String[][] questionAnswer = new String[TOTAL_ROUNDS][ANSWERS_ARRAY_SIZE];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int number1 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = number1 + " " + number2;
            String answer = String.valueOf(gcdCalculation(number1, number2));
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.run(GAME_TASK, questionAnswer);
    }
    private static int gcdCalculation(int value1, int value2) {
        while (value1 != 0 && value2 != 0) {
            if (value1 > value2) {
                value1 = value1 % value2;
            } else {
                value2 = value2 % value1;
            }
        }
        return value1 + value2;
    }
}
