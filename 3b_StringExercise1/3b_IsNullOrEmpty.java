/* 3b. String Exercise progams
   Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
*/


public class IsNullOrEmpty {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String input = "   ";
        System.out.println("Is null or empty? " + isNullOrEmpty(input));
    }
}
