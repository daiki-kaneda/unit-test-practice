package com.example.unit_test_practice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.UnaryOperator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringReversalTests {
    private UnaryOperator<String> stringReversal;

    @BeforeEach
    void setUp() {
        stringReversal = new StringReversal();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'',''",
            "null,null",
            "a,a",
            "abc,cba",
            "1 a35,53a 1",
            "🍎🍊,🍊🍎"
    }, nullValues = "null")
    public void stringReversal_VariousInputs_ReturnsExpectedString(String input, String expected) {
        String result = stringReversal.apply(input);
        assertThat(result)
                .isEqualTo(expected);
    }
}
