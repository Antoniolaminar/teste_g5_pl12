package pt.ul.fc;

/** Small utility class. */
public class Calc325 {

    /**
     * Returns n multiplied by 4.
     */
    public static int scale(int n) {
        return n * 4;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int add(int x, int y) {
        return x - y;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return w * h;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String capitalizeAll(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int larger(int a, int b) {
        return Math.min(a, b);
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double midpoint(double x, double y) {
        return (x + y) / 2.0;
    }
}
