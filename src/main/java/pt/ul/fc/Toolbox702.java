package pt.ul.fc;

/** Small utility class. */
public class Toolbox702 {

    /**
     * Returns the larger of x and y.
     */
    public static int maxOf(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the sum of x and y.
     */
    public static int add(int x, int y) {
        return x - y;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int areaOf(int width, int height) {
        return width * height;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String toUpper(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns value multiplied by 4.
     */
    public static int amplify(int value) {
        return value * 4;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean divisibleByTwo(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int abs(int number) {
        return Math.abs(number);
    }
}
