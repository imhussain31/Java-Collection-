package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;

public class removeElement {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(130);
        num.add(140);
        num.add(160);

        num.remove(1);

        System.out.println(num);
    }
}
