package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class iterateElement {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(10 , 20 , 30 , 40 , 50 ,60));

        Iterator<Integer> iterator = elements.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
     }
}
