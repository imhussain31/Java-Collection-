package HashMapConcept.HashMaproblems;

import java.util.HashMap;

public class copyAllTheElementsInAnotherData {
    public static void main(String[] args) {
        HashMap<Integer , String> colors = new HashMap<>();
        colors.put(1 , "Green");
        colors.put(2 , "Blue");
        colors.put(3 , "White");
        colors.put(4 , "Black");

        System.out.println(colors);

        HashMap<Integer , String> colors1 = new HashMap<>();
        colors1.put(1 , "Navy Blue");
        colors1.put(2 ,"Gray");

        colors.putAll(colors1);
        System.out.println(colors);
    }
}
