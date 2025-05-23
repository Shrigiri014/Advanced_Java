/* 3b. String Exercise progams
   Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
*/


public class CountOccurrences {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "AIET is awesome. AIET students are great.";
        String keyword = "AIET";
        System.out.println("Occurrences of '" + keyword + "': " + countOccurrences(text, keyword));
    }
}
