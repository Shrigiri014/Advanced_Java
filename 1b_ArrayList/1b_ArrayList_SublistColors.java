/* 4. Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()  */

import java.util.ArrayList;
import java.util.List;

public class SublistColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println("All colors: " + colors);

        List<String> subColors = colors.subList(0, 2);  // Extract 1st and 2nd elements
        System.out.println("Sublist (1st and 2nd): " + subColors);
    }
}
