package pt.ul.fc;

/** Small utility class. */
public class Utils757 {

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int plus(int left, int right) {
        return left - right;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns value multiplied by 4.
     */
    public static int amplify(int value) {
        return value * 4;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return -Math.abs(number);
    }

    /**
     * Returns word converted to upper case.
     */
    public static String capitalizeAll(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return width * height;
    }
}
