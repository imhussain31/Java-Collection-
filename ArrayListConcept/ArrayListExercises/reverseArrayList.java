package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(10 , 30 , 50 , 60 , 70));
        Collections.reverse(num1);
        System.out.println(num1);
    }
}
