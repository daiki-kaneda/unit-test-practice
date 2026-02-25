package com.example.unit_test_practice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountTests {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    @DisplayName("口座作成時は残高が0であること")
    @Test
    public void balance_WhenAccountCreated_ReturnsZero() {
        assertThat(bankAccount.getBalance())
                .isZero();
    }

    @DisplayName("100円入金後の残高が100であること")
    @Test
    public void balance_WhenDeposit100_Returns100() {
        bankAccount.deposit(100);
        assertThat(bankAccount.getBalance())
                .isEqualTo(100);
    }

    @DisplayName("出金後の残高が減っていること")
    @Test
    public void balance_AfterWithDraw_ReturnsDecreasedBalance() {
        bankAccount.deposit(100);
        bankAccount.withDraw(50);
        assertThat(bankAccount.getBalance())
                .isEqualTo(50);
    }

    @DisplayName("残高不足の時はエラーを返すこと")
    @Test
    public void withDraw_WhenInsuffcientBalance_ThrowsIllegalStateException() {
        bankAccount.deposit(100);
        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> {
                    bankAccount.withDraw(200);
                });
        assertThat(exception.getMessage())
        .contains("不足");
    }
}
