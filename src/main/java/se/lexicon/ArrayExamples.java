package se.lexicon;


public class ArrayExamples {
    public static void main(String[] args) {

        //Declaration
       // int[] numbers;
        String[] names;
        //Initialization
       // numbers = new int[3]; // reserve enough memory to hold 3 ints [0,0,0]
        String[] stringArray = new String[3]; //[null,null,null]

        int[] numbersArr = new int[]{2, 4, 6, 8};
        int[] numbersArrInShortenedSyntax = {2, 4, 6, 8};

        int[] numbers = {20, 66, 20, 14};
        int result = findMaxNumber(numbers);

    }

    //Accessing and Modifying Elements
    public static void ex1() {
        String[] names = new String[3];// [John,null,null]
        System.out.println(names.length); //tells us how many elements are in the array
        names[0] = "John";
        names[names.length - 1] = "Fredrik";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //names[3] = "Test"; Java will throw an ArrayIndexOutOfBoundsException

    }
    public static void ex2(){
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
        for (int number : numbers) {
            if (number == 5) number = 5000;
            System.out.println(number);
        }
        System.out.println("-----------------------------");
        for (int number : numbers) {
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
        newArray[newArray.length - 1] = 7;

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


}
