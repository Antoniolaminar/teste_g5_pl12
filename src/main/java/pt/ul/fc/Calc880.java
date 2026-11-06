package pt.ul.fc;

/** Small utility class. */
public class Calc880 {

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double c) {
        return c * 9.0 / 5.0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double mean(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int abs(int value) {
        return Math.abs(value);
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return width * height;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String loud(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns n multiplied by 3.
     */
    public static int multiply(int n) {
        return n + 3;
    }
}
