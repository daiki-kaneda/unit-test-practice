package com.example.unit_test_practice;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b){
        if(b==0)
            throw new IllegalArgumentException("0で除算はできません。");
        return a/b;
    }
}
