package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.TOTAL_ROUNDS;
import static hexlet.code.Utils.getRandomNumber;

public class Prime {
    public static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 1;

    public static void startPrimeGame() {
        Engine.run(GAME_TASK, primeGame());
    }

    public static String[][] primeGame() {
        String[][] questionAndAnswer = new String[TOTAL_ROUNDS][2];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int checkNumber = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = String.valueOf(checkNumber);
            String answer = isPrime(checkNumber) ? "yes" : "no";
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        return questionAndAnswer;
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
