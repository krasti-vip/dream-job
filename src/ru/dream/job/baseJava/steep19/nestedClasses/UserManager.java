package ru.dream.job.baseJava.steep19.nestedClasses;

import java.util.Comparator;
import java.util.List;

public class UserManager {

    public static class User {

        private String name;

        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public void sortUser(List<User> users) {
        users.sort((User u1, User u2) -> Integer.compare(u1.getAge(), u2.getAge()));
    }
}
