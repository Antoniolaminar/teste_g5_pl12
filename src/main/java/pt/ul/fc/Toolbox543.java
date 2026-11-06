package pt.ul.fc;

/** Small utility class. */
public class Toolbox543 {

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double midpoint(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return -Math.abs(n);
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int area(int base, int side) {
        return 2 * (base + side);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String shout(String text) {
        return text.toUpperCase();
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns amount multiplied by 7.
     */
    public static int multiply(int amount) {
        return amount * 7;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.max(a, b);
    }
}
