package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;

public class printColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");

        colors.stream().forEach(color -> System.out.println(color));
    }
}
