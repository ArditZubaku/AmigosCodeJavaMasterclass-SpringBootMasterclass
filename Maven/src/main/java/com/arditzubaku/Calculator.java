package com.arditzubaku;

public class Calculator {
    public int add(int ...numbers){
        int result = 0;
        for (int number : numbers) {
            result+=number;
        }
        return result;
    }
}
