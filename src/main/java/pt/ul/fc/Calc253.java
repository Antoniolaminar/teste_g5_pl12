package pt.ul.fc;

/** Small utility class. */
public class Calc253 {

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int area(int w, int h) {
        return w * h;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String capitalizeAll(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int larger(int a, int b) {
        return Math.max(a, b);
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
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean isEven(int value) {
        return value % 2 != 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns n multiplied by 8.
     */
    public static int multiply(int n) {
        return n * 8;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
