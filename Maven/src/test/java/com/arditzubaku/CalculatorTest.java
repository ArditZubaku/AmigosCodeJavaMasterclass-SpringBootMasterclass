package com.arditzubaku;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("Test 2")
    void canAddTwoNumbers(){
        Calculator underTest = new Calculator();
        int num1 = 10;
        int num2 = 20;
        int result = underTest.add(num1,num2);
        Assertions.assertEquals(30,result);
    }

    @Test
    @DisplayName("Test 1")
    void canHandleWhenInputIsZero(){
        Calculator underTest = new Calculator();
        var number = 0;
        var result = underTest.add(number);
        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("Test 3")
    void canAddNumbersFromAGivenArray(){
        Calculator underTest = new Calculator();
        var array= new int[]{1,2,5};
        var result = underTest.add(array);
        Assertions.assertEquals(8,result);
    }

}
