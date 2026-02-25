package com.example.unit_test_practice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.unit_test_practice.greeter.Greeter;
import com.example.unit_test_practice.greeter.TimeProvider;

@ExtendWith(MockitoExtension.class)
public class GreeterMockitoTests {

    @Mock
    private TimeProvider timeProvider;

    @InjectMocks
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
        when(timeProvider.getHour())
                .thenReturn(hour);

        String result = greeter.getGreeting();

        assertThat(result).isEqualTo(
                expected);

    }
}
