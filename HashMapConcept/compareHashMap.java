package HashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class compareHashMap {
    public static void main(String[] args) {
        HashMap<Integer , String> map1 = new HashMap<>();
        map1.put(1 , "A");
        map1.put(2 , "B");
        map1.put(3, "C");

        HashMap<Integer , String> map2 = new HashMap<>();
        map2.put(1 , "A");
        map2.put(3 , "C");
        map2.put(2, "B");

        HashMap<Integer , String> map3 = new HashMap<>();
        map3.put(1 , "A");
        map3.put(2 , "B");
        map3.put(3, "C");
        map3.put(3, "D");

        //1. On the basis of key-value : using equals method
        System.out.println(map1.equals(map2));
        System.out.println(map2.equals(map3));

        //2. Compare HashMap for the same key: using keySet
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));

        //3.Find out the extra keys
        HashMap<Integer , String> map4 = new HashMap<>();
        map4.put(1 , "A");
        map4.put(2 , "B");
        map4.put(3, "C");
        map4.put(4, "D");

        //Combine the keys from both of the map using HashSet
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());

        System.out.println(combineKeys);

        //compare hashmap by Values
        HashMap<Integer , String> map5 = new HashMap<>();
        map5.put(1 , "A");
        map5.put(2 , "B");
        map5.put(3, "C");

        HashMap<Integer , String> map6 = new HashMap<>();
        map6.put(1 , "A");
        map6.put(2 , "B");
        map6.put(3, "C");

        HashMap<Integer , String> map7 = new HashMap<>();
        map7.put(1 , "A");
        map7.put(2 , "B");
        map7.put(3, "C");
        map7.put(4, "C");

        //Duplicates are not allowed
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));


        //Duplicate values are allowed
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));

    }
}
