package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.TOTAL_ROUNDS;

public class Prime {
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;
    private static final int ANSWERS_ARRAY_SIZE = 2;

    public static void primeGame() {
        String[][] questionAnswer = new String[TOTAL_ROUNDS][ANSWERS_ARRAY_SIZE];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int checkNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            String question = String.valueOf(checkNumber);
            String answer = isPrime(checkNumber) ? "yes" : "no";
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }

        Engine.run(GAME_TASK, questionAnswer);
    }
    public static boolean isPrime(int checkNumber) {
        int numOfDividers = 0;

        for (int i = checkNumber; i > 0; i--) {
            if (checkNumber % i == 0) {
                numOfDividers++;
            }
        }

        return numOfDividers == 2;
    }

}
