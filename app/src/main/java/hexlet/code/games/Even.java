
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.TOTAL_ROUNDS;

public class Even {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    private static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startEvenGame() {
        Engine.run(GAME_TASK, evenGame());
    }

    private static String[][] evenGame() {
        String[][] questionAnswer = new String[TOTAL_ROUNDS][2];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int numberTest = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = String.valueOf(numberTest);
            String answer = evenGameCheck(numberTest) ? "yes" : "no";
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }
        return questionAnswer;
    }

    private static boolean evenGameCheck(int numberTest) {
        return numberTest % 2 == 0;
    }
}
