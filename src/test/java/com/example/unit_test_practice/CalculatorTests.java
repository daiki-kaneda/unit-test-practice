package com.example.unit_test_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTests {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest(name = "{0}+{1}が{2}になること")
    @CsvSource({
            "1,2,3",
            "-3,4,1",
            "1,-1,0",
            "-2,-3,-5",
            "0,1,1",
    })
    void add_VariousNumbers_ReturnsExpectedSum(
            int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertThat(result)
                .isEqualTo(expected);
    }
}
