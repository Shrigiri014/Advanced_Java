/* 2.Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator()) */

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Iterator<String> reverseIt = colors.descendingIterator();
        System.out.println("Reverse iteration:");
        while (reverseIt.hasNext()) {
            System.out.println(reverseIt.next());
        }
    }
}
