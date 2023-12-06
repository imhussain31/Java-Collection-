package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class searchElement {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10 , 30 , 50 , 60 , 70));
        System.out.println(num.contains(100));
    }
}
