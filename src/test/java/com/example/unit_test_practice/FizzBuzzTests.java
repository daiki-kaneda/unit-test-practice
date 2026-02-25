package com.example.unit_test_practice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {
    private Function<Integer, String> fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest(name = "{0}が入力の時、{1}となること")
    @CsvSource({
            "1,1",
            "8,8",
            "23,23",
            "3,Fizz",
            "-9,Fizz",
            "5,Buzz",
            "-20,Buzz",
            "0,FizzBuzz",
            "15,FizzBuzz",
            "-45,FizzBuzz",
    })
    public void fizzBuzz_VariousNumbers_ReturnsExpectedValue(
            Integer n, String expected) {
        String result = fizzBuzz.apply(n);
        assertThat(result)
                .isEqualTo(expected);
    }
}
