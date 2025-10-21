package se.lexicon;


import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declaration
        // int[] numbers;
        String[] names;
        //Initialization
        // numbers = new int[3]; // reserve enough memory to hold 3 ints [0,0,0]

        //Declare & Initialize Together
        String[] stringArray = new String[3]; //[null,null,null]

        // Initialize With Values Immediately
        int[] numbersArr = new int[]{2, 4, 6, 8};
        int[] numbersArrInShortenedSyntax = {2, 4, 6, 8};

        //Finding a max number
        int[] numbers = {20, 66, 20, 14};
        int result = findMaxNumber(numbers);

        ex6();

    }

    //Accessing and Modifying Elements
    public static void ex1() {
        String[] names = new String[3];// [John,null,Fredrik]
        System.out.println(names.length); //tells us how many elements are in the array
        names[0] = "John";
        names[names.length - 1] = "Fredrik";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //names[3] = "Test"; Java will throw an ArrayIndexOutOfBoundsException

    }

    public static void ex2() {
        //Iterating Through Arrays
        int[] numbers = {5, 2, 3, 4, 7}; // [5, 2, 200, 4, 7]
        //traditional for loop
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                numbers[i] = 200;
            }
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        System.out.println("-----------------------------------");
        //Enhanced for loop
        for (int number : numbers) { // [5000, 2, 200, 4, 7]
            if (number == 5) number = 5000;
            System.out.println(number);
        }
        System.out.println("-----------------------------");
        for (int number : numbers) {// [5, 2, 200, 4, 7]
            System.out.println(number);
        }

    }

    //Expanding Arrays
    public static void ex3() {
        int[] originalArray = {2, 5, 8, 1, 9};
        System.out.println("Original Array:");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] newArray = new int[originalArray.length + 1];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length - 1] = 7; // [2, 5, 8, 1, 9, 7]

        System.out.println("Expanded Array:");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // Finding a max number
    public static int findMaxNumber(int[] numbers) {// [20, 66, 20, 14]
        if (numbers.length == 0) throw new IllegalArgumentException("Array is empty");
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) maxNumber = numbers[i];
        }
        System.out.println("Maximum Number is : " + maxNumber);

        return maxNumber;

        //maxnumber=20
        //maxnumber=66>20  66
        //maxnumber=20>66   66
        //maxnumber=14>66    66


    }


    // merging two arrays
    public static void ex5() {
        // Two string arrays to be merged
        String[] array1 = {"apple", "banana", "orange"};
        String[] array2 = {"grape", "kiwi", "mango"};

        // Calculate the length of the merged array
        int mergedLength = array1.length + array2.length;
        // Create a new array with size equal to the sum of the lengths of the two arrays
        String[] mergedArray = new String[mergedLength];

        // Copy elements from the first array to the merged array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array to the merged array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        System.out.println("Merged Array:" + Arrays.toString(mergedArray));

    }

    // Example of working with a two-dimensional array
    public static void ex6() {
        // Declare a 3x3(3 by 3) two-dimensional array of Strings (a "board" for this example)
        String[][] board = new String[3][3];
        // Two-dimensional arrays can be visualized as a grid or table:

        // column [0] [1] [2]
        // row[0]  O   X   O
        // row[1]  O   X   X
        // row[2]  X   O   X

        // Fill the board with values ("O" and "X") for each cell
        board[0][0] = "O";  // First row, first column
        board[0][1] = "X";  // First row, second column
        board[0][2] = "O";  // First row, third column

        board[1][0] = "O";  // Second row, first column
        board[1][1] = "X";  // Second row, second column
        board[1][2] = "X";  // Second row, third column

        board[2][0] = "X";  // Third row, first column
        board[2][1] = "O";  // Third row, second column
        board[2][2] = "X";  // Third row, third column

        // Nested loop to iterate over the two-dimensional array (the board)
        // Outer loop goes through each row
        for (int i = 0; i < board.length; i++) {
            // Inner loop goes through each column of the current row
            for (int j = 0; j < board[i].length; j++) {
                // Print the value in the current row and column, followed by a tab for spacing
                System.out.print(board[i][j] + "\t");
            }
            // After each row, move to the next line to display the next row correctly
            System.out.println("\n");
        }
    }


}
