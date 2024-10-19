package ru.dream.job.constructorTask.bankAccount;

/**
 * Класс "Аккаунт" в банке:
 *
 * Создайте класс BankAccount с полями: номер аккаунта, имя владельца, баланс.
 * Реализуйте несколько конструкторов: по умолчанию и с инициализацией всех полей.
 * Добавьте методы для пополнения и снятия средств с аккаунта.
 * Протестируйте работу с несколькими аккаунтами.
 */

public class BankAccount {

    private String numberId;
    private String name;
    private double balance;
    // создаю пустой конструктор
    public BankAccount() {}

    //создаю конструктор с реализацией всех полей
    public BankAccount(String numberId, String name, double balance) {
        this.numberId = numberId;
        this.name = name;
        this.balance = balance;
    }

    // метод который позволяет пополнять баланс, сначало проверяет что сумма пополнения больше 0, затем ее прибавляет к
    // балансу, возвращаем новый баланс, если сумма пополнения отрицательная то баланс возвращается без изменений
    public double balanceReplenishment(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        } else {
            System.out.println("Сумма должна быть указана");
            return balance;
        }
    }
    // метод который позволяет снимать деньги со счета, сначала проверяет что сумма снятия больше 0 и сумма снятия меньше
    // или равна балансу, затем снимает необходимую сумму и возвращает новый баланс, если условия не выполнены то
    // проверяет баланс если сумма снятия больше баланса то выведит об этом сообщении так же при сумму вывода отричательной
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else if (amount > balance) {
            System.out.println("Недостаточно средств для снятия " + amount + ".");
            return false;
        } else {
            System.out.println("Сумма снятия должна быть положительной.");
            return false;
        }
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
