/* 3b. String Exercise progams
   Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace() 
*/


public class RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "  AIET   College of   Engineering ";
        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
    }
}
