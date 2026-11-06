package pt.ul.fc;

/** Small utility class. */
public class MathKit868 {

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int rectArea(int base, int side) {
        return base * side;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int biggest(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return Math.abs(n);
    }

    /**
     * Returns word converted to upper case.
     */
    public static String loud(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double average(double x, double y) {
        return (x + y) / 3.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 != 0;
    }

    /**
     * Returns amount multiplied by 7.
     */
    public static int multiply(int amount) {
        return amount * 7;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isPositive(int value) {
        return value > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
}
