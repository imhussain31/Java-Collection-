package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArray {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(10 , 30 , 50 , 60 , 70));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(10 , 90 , 50 , 60 , 70));

        for (Integer n : num1){
            System.out.println(num2.contains(n));
        }

    }
}
