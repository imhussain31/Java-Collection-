package HashMapConcept.HashMaproblems;

import java.util.HashMap;

public class sizeOfkeyValue {
    public static void main(String[] args) {
        HashMap<String , String> colors = new HashMap<>();
        colors.put("one" , "Rose");
        colors.put("two" , "water Lilly");

        System.out.println(colors.size());
    }
}
