package ru.dream.job.constructorTask.user;

public class UserMain {
    public static void main(String[] args) {

        // Создание пользователя с доступом гостя
        User user1 = new User();
        user1.greet();  // Привет, Guest! Вы вошли как гость.
        System.out.println();

        // Создание администратора
        User user2 = new User("Алексей", "admin");
        user2.greet();  // Привет, Алексей! Добро пожаловать в административную панель.
        System.out.println();

        // Создание пользователя с кастомным уровнем доступа
            User user3 = new User("Иван", "редактор");
        user3.greet();  // Привет, Иван! У вас уровень доступа: editor.
        System.out.println();

        // Создание еще одного гостевого пользователя
        User user4 = new User("Сергей", "guest");
        user4.greet();  // Привет, Сергей! Вы вошли как гость.
    }
}
