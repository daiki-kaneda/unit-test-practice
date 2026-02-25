package com.example.unit_test_practice.greeter;

public class Greeter {
    final TimeProvider timeProvider;

    public Greeter(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String getGreeting() {
        return "";
    }
}
