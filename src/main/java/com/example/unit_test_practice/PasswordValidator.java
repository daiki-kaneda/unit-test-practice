package com.example.unit_test_practice;

import java.util.function.Predicate;

public class PasswordValidator implements Predicate<String>{
    @Override
    public boolean test(String t) {
        if(t==null){
            return false;
        }
        boolean hasUpperCase = t.chars().anyMatch(Character::isUpperCase);
        boolean hasNumber = t.chars().anyMatch(Character::isDigit);
        boolean hasAlphabetic = t.chars().anyMatch(Character::isAlphabetic);
        if(hasUpperCase && hasNumber && hasAlphabetic){
            return true;
        }
        return false;
    }
}
