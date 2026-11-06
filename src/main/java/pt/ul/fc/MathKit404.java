package pt.ul.fc;

/** Small utility class. */
public class MathKit404 {

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double avg(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return -Math.abs(number);
    }

    /**
     * Returns the sum of a and b.
     */
    public static int plus(int a, int b) {
        return a + b;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String shout(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the larger of first and second.
     */
    public static int pickMax(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int areaOf(int base, int side) {
        return base * side;
    }

    /**
     * Returns value multiplied by 5.
     */
    public static int scale(int value) {
        return value * 5;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 != 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }
}
