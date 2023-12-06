package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(50 , 30 , 10 , 60 ,90 , 100 , 70));
        Collections.sort(num);
        System.out.println(num);
    }
}
