/* 3c. String Exercise programs
   Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords() .
*/


public class CountWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "AIET is located in Hassan Karnataka";
        System.out.println("Word count: " + countWords(input));
    }
}
