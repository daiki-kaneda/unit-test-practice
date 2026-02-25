package com.example.unit_test_practice;

import java.util.function.Function;

public class FizzBuzz implements Function<Integer, String> {
    public String apply(Integer n) {
        if (n % 15 == 0)
            return "FizzBuzz";
        if (n % 3 == 0)
            return "Fizz";
        if (n % 5 == 0)
            return "Buzz";

        return String.valueOf(n);
    }
}
