package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;

public class replaceElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");

        colors.set(0 , "White");
        System.out.println(colors);
    }
}
