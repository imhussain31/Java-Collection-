package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class retrieveAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10 , 20  ,40 , 70 , 50));
        System.out.println(arr.get(2));
    }
}
