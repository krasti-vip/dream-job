package ru.dream.job.baseJava.steep19.nestedClasses.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.dream.job.baseJava.steep19.nestedClasses.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    private BankAccount bankAccount;
    private BankAccount.SberOnline sberOnline;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
        sberOnline = bankAccount.new SberOnline(); // Инициализация вложенного класса
    }

    @Test
    void replenishmentTest() {
        assertEquals(50.036, sberOnline.scoreBalance(), 0.001);

        sberOnline.replenishment(10.0);
        assertEquals(60.036, sberOnline.scoreBalance(), 0.001);
    }

    @Test
    void replenishTest() {
        // Проверяем уменьшение средств
        double newBalance = sberOnline.replenish(10.0);
        assertEquals(40.036, newBalance, 0.001);
        assertEquals(40.036, sberOnline.scoreBalance(), 0.001);
    }

    @Test
    void replenishInsufficientFundsTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sberOnline.replenish(100.0);
        });
        assertEquals("Денег не хватает", exception.getMessage());
    }
}
