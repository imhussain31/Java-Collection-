package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> names =  new ArrayList<>();
        names.add("Jilan");
        names.add("Hasan");
        names.add("Nihan");
        names.add("Basit");

        //Typical for loop
        System.out.println("Typical For loop");
        for (int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        //Using for each loop
        System.out.println("For each loop");
        for (String s  : names){
            System.out.println(s);
        }

        //JDK - 8 streams with Lamda
        System.out.println("Streams with Lamda");
        names.stream().forEach(element -> System.out.println(element));

        //using Iterator
        System.out.println("Using Iteration");
        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
     }
}
