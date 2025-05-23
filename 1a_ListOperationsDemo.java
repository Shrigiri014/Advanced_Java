/*  1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as follows
    1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.Accessing elements,
    5. Updating elements, 6. Removing elements, 7. Searching elements, 8. Listsize, 9. Iterating over list,
    10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list  .
*/

import java.util.*;

public class ListOperationsDemo {
    public static void main(String[] args) {
        // Initial elements
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Operations ===");
        performOperations(arrayList);

        System.out.println("\n=== LinkedList Operations ===");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);

        // 2. Adding element at specific index
        list.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        list.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(2, "Cherry");
        System.out.println("After updating index 2 to 'Cherry': " + list);

        // 6. Removing elements
        list.remove("Banana");
        list.remove(0); // Removes "Apple"
        System.out.println("After removing 'Banana' and element at index 0: " + list);

        // 7. Searching elements
        System.out.println("Contains 'Orange'? " + list.contains("Orange"));

        // 8. List size
        System.out.println("List size: " + list.size());

        // 9. Iterating over list (enhanced for-loop)
        System.out.print("Iterating using for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 12. Sublist
        if (list.size() >= 2) {
            List<String> subList = list.subList(0, 2);
            System.out.println("Sublist (0 to 2): " + subList);
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
