package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.TOTAL_ROUNDS;

public class GCD {
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static void startGcdGame() {
        Engine.run(GAME_TASK, gcdGame());
    }

    public static String[][] gcdGame() {
        String[][] questionAndAnswer = new String[TOTAL_ROUNDS][2];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int number1 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = number1 + " " + number2;
            String answer = String.valueOf(getGcd(number1, number2));
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        return questionAndAnswer;
    }

    private static int getGcd(int value1, int value2) {
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
