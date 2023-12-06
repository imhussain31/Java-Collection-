package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;

public class insertAnelementInFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> sent = new ArrayList<>();
        sent.add("Hi");
        sent.add("Hello");
        sent.add("Hey!");
        sent.add("What's Up");

        sent.add(0 , "Assalamua'alaikum");

        System.out.println(sent);
    }
}
