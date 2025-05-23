/* 3. Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink")) */

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");

        colors.offerLast("Pink"); // Insert at end

        System.out.println("After inserting 'Pink' at end: " + colors);
    }
}
