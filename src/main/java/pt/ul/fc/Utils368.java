package pt.ul.fc;

/** Small utility class. */
public class Utils368 {

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int larger(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toUpperCase();
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isPositive(int value) {
        return value > 0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x - y;
    }

    /**
     * Returns n multiplied by 4.
     */
    public static int scale(int n) {
        return n * 4;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int areaOf(int base, int side) {
        return base * side;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int absolute(int n) {
        return -Math.abs(n);
    }
}
