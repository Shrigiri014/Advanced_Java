/* 1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not. */

import java.util.ArrayList;

public class RemoveColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println("Original colors: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);
        // Remove "Blue"
        colors.remove("Blue");

        System.out.println("After removing 2nd element and 'Blue': " + colors);
    }
}
