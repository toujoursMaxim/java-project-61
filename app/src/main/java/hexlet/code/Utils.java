package hexlet.code;

public class Utils {
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * max);
    }

    public static int getRandomNumberPosition(int length) {
        return (int) (Math.random() * length);
    }
}
