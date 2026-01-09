package com.imt.mines;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    private static Person holder;

    @BeforeAll
    static void setUp() throws Exception {
        holder = new Person("Lenny", 'M', 22, 52.0f, 1.72f, "brown", "black", "lenny@gmail.com");
    }

    @Test
    void deposit_happyPath_balanceIncreases() {
        BankAccount account = new BankAccount(100.0, 500.0, "2026-01-09", holder);
        account.depositMoney(200.0);
        assertEquals(300.0, account.getBalance());
    }

    @Test
    void deposit_edgeCase_negativeAmount_noChange() {
        BankAccount account = new BankAccount(100.0, 500.0, "2026-01-09", holder);
        double initialBalance = account.getBalance();
        account.depositMoney(-50.0);
        assertEquals(initialBalance, account.getBalance());
    }

    @Test
    void withdraw_happyPath_balanceDecreases() {
        BankAccount account = new BankAccount(500.0, 300.0, "2026-01-09", holder);
        boolean success = account.withdrawMoney(100.0);
        assertTrue(success);
        assertEquals(400.0, account.getBalance());
    }

    @Test
    void withdraw_edgeCase_overLimit_fails() {
        BankAccount account = new BankAccount(200.0, 150.0, "2026-01-09", holder);
        boolean success = account.withdrawMoney(180.0);
        assertFalse(success);
        assertEquals(200.0, account.getBalance());
    }
}
