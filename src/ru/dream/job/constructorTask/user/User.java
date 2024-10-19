package ru.dream.job.constructorTask.user;

/**
 * Класс "Пользователь" с разными уровнями доступа:
 *
 * Создайте класс User с полями: имя пользователя, уровень доступа (например, "admin", "guest").
 * Реализуйте конструкторы: один по умолчанию, который создает "guest", и другой, который принимает имя и уровень доступа.
 * Напишите метод, который выводит приветствие в зависимости от уровня доступа.
 * Создайте несколько пользователей и протестируйте работу.
 */
public class User {

    private String username;
    private String accessLevel;

    /**
     * реализация конструктора по умолчанию с заданными полями
     */
    public User() {
        this.username = "Guest";
        this.accessLevel = "guest";
    }

    /**
     * создание параметрализированного конструктора
     * @param username
     * @param accessLevel
     */
    public User(String username, String accessLevel) {
        this.username = username;
        this.accessLevel = accessLevel;
    }

    /** метод который проверяет уровень допуска, а затем выводит приветственное сообщение
     * в зависимости от уровня пользователя
     */
    public void greet() {
        switch (this.accessLevel.toLowerCase()) {
            case "admin":
                System.out.println("Привет, " + username + "! Добро пожаловать в административную панель.");
                break;
            case "guest":
                System.out.println("Привет, " + username + "! Вы вошли как гость.");
                break;
            default:
                System.out.println("Привет, " + username + "! У вас уровень доступа: " + accessLevel);
                break;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
}
