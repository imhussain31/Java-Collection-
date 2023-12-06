package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {

        //no order and no indexing
        //store values - key-value<k,v>
        //key can not be duplicate

        HashMap<String , String > capitalsMap = new HashMap<>();
        capitalsMap.put("India" , "New Delhi");
        capitalsMap.put("USA" ,"Washington DC");
        capitalsMap.put("UK" ,"LONDON");
        capitalsMap.put("Qatar" ,"Doha");
        capitalsMap.put(null , "Berlin");

        System.out.println(capitalsMap.get("UK"));
        System.out.println(capitalsMap.get(null));

        //iterator : using key set
        Iterator<String> it = capitalsMap.keySet().iterator();

        System.out.println("Using iterator:using KeySet");
        while (it.hasNext()){
            String key  = it.next();
            System.out.println(capitalsMap.get(key));
        }

        //iterator : using entry set
        System.out.println("Using iterator:using EntrySet");
        Iterator<Map.Entry<String , String>> it1 = capitalsMap.entrySet().iterator();

        while (it1.hasNext()){
            Map.Entry<String ,String> key = it1.next();
            System.out.println(key.getValue());
        }

        //iterating hashmap using java 8 foreach or lambda
        System.out.println("Using iterator:using foreach or lambda");
        capitalsMap.forEach((k , v)-> System.out.println(v));

    }
}
