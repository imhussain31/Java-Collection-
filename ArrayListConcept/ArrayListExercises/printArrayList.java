package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class printArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(10 , 30 , 50 , 60 , 70));

        System.out.println(num1);

        num1.stream().forEach(element -> System.out.println(element));
    }
}


