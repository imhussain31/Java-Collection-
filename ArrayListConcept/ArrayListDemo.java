package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        //Default class
        //Dynamic Array

        //Default generics
        ArrayList<Object> arr = new ArrayList<>();

        arr.add(200);
        arr.add("Hussain");
        arr.add(2.33);
        arr.add('E');
        arr.add(true);

        System.out.println(arr);

        System.out.println(arr.get(3));
        System.out.println("Size of ArrayList - "+arr.size());

        arr.remove(3);
        System.out.println("Size of ArrayList - "+arr.size());

        arr.set(3 , "Nihan");

        System.out.println(arr);

        //List with other collection

        ArrayList<Integer>  arr2 = new ArrayList<>(Arrays.asList(10 , 20 , 30  ,40));
        System.out.println(arr2);

    }
}
