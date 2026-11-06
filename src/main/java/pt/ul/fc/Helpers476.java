package pt.ul.fc;

/** Small utility class. */
public class Helpers476 {

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int area(int width, int height) {
        return width * height;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 4.0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isAboveZero(int number) {
        return number > 0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int distanceFromZero(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0;
    }

    /**
     * Returns amount multiplied by 7.
     */
    public static int times(int amount) {
        return amount * 7;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int maxOf(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }
}
