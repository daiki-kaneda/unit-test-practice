package com.example.unit_test_practice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Predicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PasswordValidatorTests {
    private Predicate<String> passwordValidator;

    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @ParameterizedTest(name = "パスワードが{0}の時、falseになること")
    @CsvSource(value = {
            "null",
            "''",
            "abc",
            "abcdefgh",
            "123",
            "12345678",
            "abd123567",
            "383ajsdijfi"
    }, nullValues = "null")
    public void validate_BadPasswords_ReturnsFalse(
            String password) {
        boolean result = passwordValidator.test(password);
        assertThat(result)
                .isFalse();
    }

    @ParameterizedTest(name = "パスワードが{0}の時、trueになること")
    @CsvSource(value = {
            "aAdj2fjof",
            "ABCD750725",
            "25794759B",
            "A2345742",
    }, nullValues = "null")
    public void validate_GoodPasswords_ReturnsTrue(
            String password) {
        boolean result = passwordValidator.test(password);
        assertThat(result)
                .isTrue();
    }

}
