package pt.ul.fc;

/** Small utility class. */
public class MathKit942 {

    /**
     * Returns the sum of left and right.
     */
    public static int add(int left, int right) {
        return left + right;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number < 0;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean even(int number) {
        return number % 2 != 0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int area(int base, int side) {
        return base * side;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int absolute(int n) {
        return Math.abs(n);
    }

    /**
     * Returns value multiplied by 9.
     */
    public static int amplify(int value) {
        return value * 9;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String capitalizeAll(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }
}
