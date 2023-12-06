package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class shuffleArray {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(10 , 20 , 30 , 40 , 50 , 60));

        //Shuffle does just the opposite of the sorting
        Collections.shuffle(num1);
        System.out.println(num1);
    }
}
