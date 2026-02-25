package com.example.unit_test_practice;

import java.util.function.Predicate;

public class PasswordValidator implements Predicate<String>{
    @Override
    public boolean test(String t) {
        return false;
    }
}
