/* 1. Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1)) */

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        ListIterator<String> iterator = colors.listIterator(1); // Start from 2nd element (index 1)
        System.out.println("Iterating from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
