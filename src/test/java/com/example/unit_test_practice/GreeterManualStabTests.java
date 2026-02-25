package com.example.unit_test_practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.unit_test_practice.greeter.Greeter;
import com.example.unit_test_practice.greeter.TimeProvider;

public class GreeterManualStabTests {

    private Greeter greeter;

    @ParameterizedTest(name = "{0}時の時は,{1}を返すこと")
    @CsvSource({
            "0,Good Morning",
            "5,Good Morning",
            "12,Good Morning",
            "13,Hello",
            "16,Hello",
            "23,Hello",
    })
    public void get_VariousInput_ReturnsExpectedGreet(
            int hour, String expected) {
        TimeProvider timeProvider = new TimeProvider() {
            @Override
            public int getHour() {
                return hour;
            }
        };

        greeter = new Greeter(timeProvider);

        assertThat(greeter.getGreeting())
                .isEqualTo(expected);

    }
}
