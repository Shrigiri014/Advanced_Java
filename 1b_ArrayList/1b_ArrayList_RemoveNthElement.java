/* 5. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index */


import java.util.ArrayList;

public class RemoveNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        int n = 2; // 3rd element has index 2

        System.out.println("Original colors: " + colors);

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index: " + n);
        }
    }
}
