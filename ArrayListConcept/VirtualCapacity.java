package ArrayListConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualCapacity {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);

        ArrayList<Object> arr =  new ArrayList<>(20); //Virtual Capacity = 20;

        System.out.println(arr); //Here physical Capacity = 0;

        arr.add("This");
        arr.add(200);
        arr.add(2.00);

        System.out.println(arr); //Here physical Capacity = 3;
    }
}

