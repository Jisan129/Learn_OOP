package Bottles;

public class Bottles {
    String verse(int n) {
        int a;
        a = n;
        String expected = null;
        if (a > 2) {
            expected = n + " bottles of milk on the wall, " + n + " bottles of milk.\n"
                    + "Take one down and pass it around, " + (n - 1) + " bottles of milk on the wall.";
            return expected;
        }
        if (a == 2) {
            expected = n + " bottles of milk on the wall, " + n + " bottles of milk.\n"
                    + "Take one down and pass it around, " + (n - 1) + " bottle of milk on the wall.";
            return expected;
        }

        if (a == 1) {
            expected = n + " bottles of milk on the wall, " + n + " bottles of milk.\n"
                    + "Take one down and pass it around, no more bottles of milk on the wall.";
            return expected;
        }
        if (a < 1) {
            expected = "No bottles of milk on the wall, No more bottles of milk.\n" +
                    "Go to the store and buy some more, 99 bottles of milk on the wall.";
            return expected;
        }
        return expected;
    }
}
