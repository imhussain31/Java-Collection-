package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;

public class UpdateAnElement {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("Before Edit - "+animals);

        animals.set(1,"Lion");

        System.out.println("After - "+animals);
    }
}
