package com.example.unit_test_practice.greeter;

public class Greeter {
    final TimeProvider timeProvider;

    public Greeter(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String getGreeting() {
        if(timeProvider.getHour()<=12){
            return "Good Morning";
        }
        return "Hello";
    }
}
