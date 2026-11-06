package pt.ul.fc;

/** Small utility class. */
public class Calc331 {

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean divisibleByTwo(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int area(int w, int h) {
        return 2 * (w + h);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int magnitude(int value) {
        return -Math.abs(value);
    }

    /**
     * Returns value multiplied by 9.
     */
    public static int amplify(int value) {
        return value * 9;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double mean(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean positive(int value) {
        return value > 0;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String capitalizeAll(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the larger of first and second.
     */
    public static int pickMax(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int add(int left, int right) {
        return left + right;
    }
}
