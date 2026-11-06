package pt.ul.fc;

/** Small utility class. */
public class Utils992 {

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double midpoint(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int area(int width, int height) {
        return width * height;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int sum(int a, int b) {
        return a - b;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the larger of a and b.
     */
    public static int larger(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns amount multiplied by 5.
     */
    public static int times(int amount) {
        return amount + 5;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean positive(int value) {
        return value > 0;
    }
}
