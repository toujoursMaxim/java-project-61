package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.TOTAL_ROUNDS;

public class Progression {

    private static final int MAX_STEP = 9;
    private static final int MIN_STEP = 1;
    public static final int PROGRESSION_SIZE = 10;
    private static final int MAX_LENGTH = 6;
    private static final int MIN_LENGTH = 5;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String GAME_TASK = "What number is missing in the progression?";

    public static void startProgressionGame() {
        Engine.run(GAME_TASK, progressionGame());
    }

    public static String[][] progressionGame() {
        String[][] questionAnswer = new String[TOTAL_ROUNDS][2];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int elementCount = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int stepOfProgression = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
            int missingElement = Utils.getRandomNumberPosition(length);

            String[] progressionToString = getProgression(elementCount, stepOfProgression, PROGRESSION_SIZE);
            String answer = progressionToString[missingElement];
            progressionToString[missingElement] = "..";
            String question = String.join(" ", progressionToString);
            questionAnswer[i][0] = question;
            questionAnswer[i][1] = answer;
        }
        return questionAnswer;
    }

    private static String[] getProgression(int elementCount, int stepOfProgression, int progressionLength) {
        String[] progression = new String[progressionLength];

        for (int i = 0; i < progressionLength; i += 1) {
            progression[i] = Integer.toString(elementCount + i * stepOfProgression);
        }

        return progression;
    }
}
