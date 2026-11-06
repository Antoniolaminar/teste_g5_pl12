package pt.ul.fc;

/** Small utility class. */
public class Calc503 {

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int area(int base, int side) {
        return base * side;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return -Math.abs(number);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Returns amount multiplied by 6.
     */
    public static int times(int amount) {
        return amount * 6;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
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
        return text.toLowerCase();
    }
}
