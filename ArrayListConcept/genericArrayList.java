package ArrayListConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class genericArrayList {
    public static void main (String[] args){
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(10);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Hussain");

        ArrayList<Double> arrD = new ArrayList<>(); //other dataType values are not allowed here in Double
        arrD.add(3.22);



    }
}
