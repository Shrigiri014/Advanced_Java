/*  3c. String Exercise progams
    Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric().
*/


public class IsNumeric {
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Is numeric? " + isNumeric(input));
    }
}
