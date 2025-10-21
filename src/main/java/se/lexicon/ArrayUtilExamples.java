package se.lexicon;

import java.util.Arrays;

public class ArrayUtilExamples {
    public static void main(String[] args) {
        ex3();

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


    // copyOf() use to copy an existing array content into a new array with more element.
    public static void ex2() {

        // Define the original array
        int[] numbers = {10, 20, 30, 40};


        int[] newArray = Arrays.copyOf(numbers, numbers.length + 1); // New array: {10, 20, 30, 40, 0}

        // Add a new value to the last position of the new array
        newArray[newArray.length - 1] = 50; // Add 50 to the last index (index 4)
        System.out.println("New Array (Using Arrays.copyOf): " + Arrays.toString(newArray));


        // Alternative method: Using System.arraycopy to achieve the same result
        // Create a new array with extra space
        int[] newArr = new int[numbers.length + 1];

        // Copy elements from the original array to the new array
        System.arraycopy(numbers, 0, newArr, 0, numbers.length); // New array: {10, 20, 30, 40, 0}


        // Add a value to the last position of the new array
        newArr[newArr.length - 1] = 50;
        System.out.println("New Array (Using System.arraycopy): " + Arrays.toString(newArr));

        // Additional Note:
        // In modern Java, you can also use Arrays.copyOfRange for similar functionality.

    }

    // Combining two arrays into one
    public static void ex3() {
        // Define two arrays to be combined
        String[] arr1 = {"Fredrik", "Elnaz"};
        String[] arr2 = {"Erik", "Ulf", "Simon", "Kent"};

        // Create a new array with the combined length of arr1 and arr2
        String[] combined = Arrays.copyOf(arr2, arr2.length + arr1.length);
        System.out.println("Combined Array: " + Arrays.toString(combined)); // [Erik, Ulf, Simon, Kent, null, null]

        // We need to write a loop to Copy elements from arr1 into the remaining positions of the combined array
        for (int i = arr2.length, j = 0; j < arr1.length; i++, j++) {
            combined[i] = arr1[j];
        }

        // Print the combined array
        System.out.println("Combined Array: " + Arrays.toString(combined)); // [Fredrik, Erik, Ulf, Simon, Kent]
    }
}
