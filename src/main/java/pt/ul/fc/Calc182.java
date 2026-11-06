package pt.ul.fc;

/** Small utility class. */
public class Calc182 {

    /**
     * Returns s converted to upper case.
     */
    public static String capitalizeAll(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the sum of x and y.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.min(x, y);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Returns value multiplied by 5.
     */
    public static int times(int value) {
        return value + 5;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int surface(int base, int side) {
        return base * side;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return Math.abs(n);
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }
}
