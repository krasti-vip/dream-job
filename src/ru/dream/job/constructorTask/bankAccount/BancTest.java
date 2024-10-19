package ru.dream.job.constructorTask.bankAccount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BancTest {

    /**
     * стандартные тесты, проверяем наш пустой конструктор, что он действительно без значений, затем присваиваем значения
     * и проверяем изменения
     */
    @Test
    @DisplayName("Тест конструктора по умолчанию")
    public void testDefaultConstructor() {
        BankAccount account = new BankAccount();
        assertNull(null, account.getNumberId());
        assertNull(null, account.getName());
        assertEquals(0, account.getBalance());
        account.setNumberId("12");
        account.setName("As");
        account.setBalance(123);
        assertEquals("12", account.getNumberId());
        assertEquals("As", account.getName());
        assertEquals(123, account.getBalance());
    }

    /**
     * тест параметизированного конструктора, добавляем параметры и проверяем что они присвоенны
     */
    @Test
    @DisplayName("Тест параметризованного конструктора")
    public void testParameterizedConstructor() {
        BankAccount account = new BankAccount("123456", "Алексей", 1000.0);
        assertEquals("123456", account.getNumberId());
        assertEquals("Алексей", account.getName());
        assertEquals(1000.0, account.getBalance());
    }

    /**
     * в тесте задаем параметры праматезированному конструкторы, затем проверяем метод пополнения баланса, прибавляем
     * 500 у.е. и проверяем равенство
     */
    @Test
    @DisplayName("Тест пополнения баланса")
    public void testDeposit() {
        BankAccount account = new BankAccount("123456", "Алексей", 1000.0);
        account.balanceReplenishment(500);
        assertEquals(1500.0, account.getBalance());
    }

    /**
     * тест по принципу метода пополнения баланса проверяем снятие средств
     */
    @Test
    @DisplayName("Тест успешного снятия средств")
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount("123456", "Алексей", 1000.0);
        account.withdraw(300);
        assertEquals(700.0, account.getBalance());
    }

    /**
     * тест на случай недостаточного количества средств на счету, на консоле будет сообщение меттода, что денег
     * не достаточно
     */
    @Test
    @DisplayName("Тест снятия средств при недостатке денег")
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount("123456", "Алексей", 500.0);
        account.withdraw(600);
        assertEquals(500.0, account.getBalance()); // Баланс не должен измениться
    }

    /**
     * тест на случай попытки снятия отрицательной суммы
     */
    @Test
    @DisplayName("Тест снятия отрицательной суммы")
    public void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount("123456", "Алексей", 500.0);
        account.withdraw(-100);
        assertEquals(500.0, account.getBalance()); // Баланс не должен измениться
    }

    /**
     * тест попытки снятия отрицательной суммы
     */
    @Test
    @DisplayName("Тест пополнения отрицательной суммы")
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount("123456", "Алексей", 500.0);
        account.balanceReplenishment(-100);
        assertEquals(500.0, account.getBalance()); // Баланс не должен измениться
    }
}
