package HashMapConcept.HashMaproblems;

import java.util.HashMap;
import java.util.Iterator;

public class SpecifiedKeyAndValue {
    public static void main(String[] args) {
        HashMap<Integer , String> animals = new HashMap<Integer, String>();
        animals.put(1 , "Tiger");
        animals.put(2 , "Dog");
        animals.put(3 ,"Cat");
        animals.put(4 , "Horse");

        Iterator<Integer> iterator = animals.keySet().iterator();

        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(animals.get(key));
        }

    }
}
