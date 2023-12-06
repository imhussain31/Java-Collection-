package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class emptyElements {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(10 , 30 , 50 , 60 , 70));
        num1.removeAll(num1);
        System.out.println(num1.size());

        System.out.println(num1.isEmpty());
    }
}
