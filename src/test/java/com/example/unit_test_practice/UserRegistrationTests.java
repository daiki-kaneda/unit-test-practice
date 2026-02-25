package com.example.unit_test_practice;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.unit_test_practice.userregistration.EmailService;
import com.example.unit_test_practice.userregistration.UserRegistration;

@ExtendWith(MockitoExtension.class)
public class UserRegistrationTests {
    @Mock
    private EmailService emailService;
    
    @InjectMocks
    private UserRegistration userRegistration;

    @DisplayName("ユーザー登録時に一回メールを送信すること")
    @Test
    public void register_WhenInvoked_SendEmailOnce(){
        userRegistration.register();
        verify(emailService, times(1)).sendEmail(anyString());
    }
}
