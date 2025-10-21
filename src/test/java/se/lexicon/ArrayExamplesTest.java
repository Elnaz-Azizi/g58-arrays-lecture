package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayExamplesTest {
    /*
    •	An array with only positive numbers.
    •	An array with only negative numbers.
    •	An array with both positive and negative numbers.
    •	An array with duplicate values.
    •	An array with a single element.
    •	An empty array (should handle it gracefully or throw an exception).

     */

    @Test
    @DisplayName("Find Max Number With Positive Numbers")
    void findMaxNumberWithPositiveNumbers(){
        //Test structure (Arrange, Act, Assert)
        //Arrange
        int[] numbers = {1, 5, 3, 9, 2};
        //Act
        int actual= ArrayExamples.findMaxNumber(numbers);

        //Assert
        int expected = 9;
        Assertions.assertEquals(expected, actual, "The max number is 9");

    }

    @Test
    @DisplayName("Find Max Number With Negative Numbers")
    void findMaxNumberWithNegativeNumbers() {
        // Test structure (Arrange, Act, Assert)
        // Arrange
        int[] numbers = {-10, -5, -3, -9, -2};

        // Act
        int actual = ArrayExamples.findMaxNumber(numbers);

        // Assert
        int expected = -2;
        Assertions.assertEquals(expected, actual, "The max number should be -2");
    }


}
