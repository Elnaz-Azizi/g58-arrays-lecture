package se.lexicon;

import java.util.Arrays;

public class ArrayUtilExamples {
    public static void main(String[] args) {
        ex1();

    }

    //Sorting an array by using the Arrays.sort method

    public static void ex1(){
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
        System.out.println("Original Array:" + Arrays.toString(names));

        //Sort in natural order
        Arrays.sort(names);
        System.out.println("Sorted (case-sensitive): " + Arrays.toString(names));
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted (case-insensitive): " + Arrays.toString(names));

        //Sort in reverse order
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println("Sorted (reversed): " + Arrays.toString(names));

    }
}
