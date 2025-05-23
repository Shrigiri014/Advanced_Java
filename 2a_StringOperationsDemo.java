/* 2 a. Develop a java program for performing various string operations with different string handling functions directed as follows 
   String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , 
   String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , 
   Validate Email with contains( ) and startsWith() and endsWith() 
*/


public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java programming is powerful";
        System.out.println("Index of 'programming': " + text.indexOf("programming"));
        System.out.println("Contains 'power': " + text.contains("power"));

        // 5. Substring Operations
        String sub = text.substring(5, 16);
        System.out.println("Substring (5 to 16): " + sub);

        // 6. String Modification
        String modified = text.replace("powerful", "awesome");
        System.out.println("After replace: " + modified);

        // 7. Whitespace Handling
        String messy = "  Hello Java  ";
        System.out.println("Original: '" + messy + "'");
        System.out.println("Trimmed: '" + messy.trim() + "'");

        // 8. String Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated: " + combined);

        // 9. String Splitting
        String csv = "Red,Green,Blue,Yellow";
        String[] colors = csv.split(",");
        System.out.println("Split colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" -> Middle");
        sb.append(" -> End");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int age = 25;
        String name = "Alice";
        String formatted = String.format("Name: %s | Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "user@example.com";
        boolean isValid = email.contains("@") &&
                          email.startsWith("user") &&
                          email.endsWith(".com");
        System.out.println("Email '" + email + "' is valid? " + isValid);
    }
}
