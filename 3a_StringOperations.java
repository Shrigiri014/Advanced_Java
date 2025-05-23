/* 3a. Develop a java program for performing various string operations with different string handling functions directed as follows:
  String Creation and Basic Operations, Length and Character Access, String Comparison, String
  Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
  String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
  startsWith() and endsWith() 
*/


public class StringOperations {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "Java Programming is fun and powerful";
        System.out.println("Does sentence contain 'fun'? " + sentence.contains("fun"));
        System.out.println("Index of 'powerful': " + sentence.indexOf("powerful"));

        // 5. Substring Operations
        String sub = sentence.substring(5, 16); // from index 5 to 15
        System.out.println("Substring (5 to 15): " + sub);

        // 6. String Modification
        String replaced = sentence.replace("powerful", "amazing");
        System.out.println("After replacement: " + replaced);

        // 7. Whitespace Handling
        String messy = "   AIET College   ";
        System.out.println("Original with whitespace: '" + messy + "'");
        System.out.println("Trimmed: '" + messy.trim() + "'");

        // 8. String Concatenation
        String full = str1 + " " + str2;
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("Split colors:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" -> Middle");
        sb.append(" -> End");
        System.out.println("StringBuilder output: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 22;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "user@aiet.edu";
        boolean isValidEmail = email.contains("@") &&
                               email.startsWith("user") &&
                               email.endsWith(".edu");
        System.out.println("Is email '" + email + "' valid? " + isValidEmail);
    }
}
