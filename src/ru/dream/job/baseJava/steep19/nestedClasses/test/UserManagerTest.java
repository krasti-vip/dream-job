package ru.dream.job.baseJava.steep19.nestedClasses.test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.dream.job.baseJava.steep19.nestedClasses.UserManager;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserManagerTest {

    @Test
    @DisplayName("Тест сортировки пользователей по возрасту")
    void sortUsersByAgeTest() {
        UserManager userManager = new UserManager();
        List<UserManager.User> users = new ArrayList<>();

        users.add(new UserManager.User("Alice", 30));
        users.add(new UserManager.User("Bob", 25));
        users.add(new UserManager.User("Charlie", 35));

        userManager.sortUser(users);

        assertEquals("Bob", users.get(0).getName());
        assertEquals("Alice", users.get(1).getName());
        assertEquals("Charlie", users.get(2).getName());
    }

    @Test
    @DisplayName("Тест сортировки пользователей с одинаковым возрастом")
    void sortUsersWithSameAgeTest() {
        UserManager userManager = new UserManager();
        List<UserManager.User> users = new ArrayList<>();

        users.add(new UserManager.User("Alice", 30));
        users.add(new UserManager.User("Bob", 30));
        users.add(new UserManager.User("Charlie", 25));

        userManager.sortUser(users);

        assertEquals("Charlie", users.get(0).getName());
        assertEquals("Alice", users.get(1).getName());
        assertEquals("Bob", users.get(2).getName());
    }

    @Test
    @DisplayName("Тест сортировки пустого списка")
    void sortEmptyListTest() {
        UserManager userManager = new UserManager();
        List<UserManager.User> users = new ArrayList<>();

        userManager.sortUser(users);

        assertTrue(users.isEmpty());
    }

    @Test
    @DisplayName("Тест сортировки списка с одним пользователем")
    void sortSingleUserTest() {
        UserManager userManager = new UserManager();
        List<UserManager.User> users = new ArrayList<>();

        users.add(new UserManager.User("Alice", 30));

        userManager.sortUser(users);

        assertEquals(1, users.size());
        assertEquals("Alice", users.get(0).getName());
        assertEquals(30, users.get(0).getAge());
    }
}
