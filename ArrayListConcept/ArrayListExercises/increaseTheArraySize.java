package ArrayListConcept.ArrayListExercises;

import java.util.ArrayList;

public class increaseTheArraySize {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(3);
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums);

        nums.ensureCapacity(6);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums);
    }
}
