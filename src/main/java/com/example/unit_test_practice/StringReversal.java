package com.example.unit_test_practice;

import java.util.function.UnaryOperator;

public class StringReversal implements UnaryOperator<String> {
    @Override
    public String apply(String t) {
        if (t == null)
            return null;
        return new StringBuilder(t)
                .reverse()
                .toString();
    }
}
