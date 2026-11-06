package pt.ul.fc;

/** Small utility class. */
public class Basics135 {

    /**
     * Returns n multiplied by 9.
     */
    public static int scale(int n) {
        return n * 9;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double average(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double degrees) {
        return degrees * 9.0 / 5.0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int larger(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return 2 * (w + h);
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean divisibleByTwo(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int sum(int left, int right) {
        return left + right;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String shout(String word) {
        return word.toUpperCase();
    }
}
