/* 5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2)) */

import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Before swap: " + colors);
        Collections.swap(colors, 0, 2); // Swap 1st (index 0) and 3rd (index 2)
        System.out.println("After swapping 1st and 3rd: " + colors);
    }
}
