package ru.dream.job.taskInterface.group3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SorterTest {

    @Test
    @DisplayName("Проверка правильности сортировки")
    public void sortByNameTest() {
      List<Person> people = new ArrayList<>();
      NameSorter nameSorter = new NameSorter();

      people.add(new Person("John"));
      people.add(new Person("Alice"));
      people.add(new Person("Bob"));
      nameSorter.sort(people);

      Assertions.assertEquals("Alice", people.get(0).getName());
      Assertions.assertEquals("Bob", people.get(1).getName());
      Assertions.assertEquals("John", people.get(2).getName());
    }

    @Test
    @DisplayName("Проверка сортировки пустого списка")
    public void emptyListTest() {
      List<Person> people = new ArrayList<>();
      NameSorter nameSorter = new NameSorter();

      nameSorter.sort(people);

      Assertions.assertTrue(people.isEmpty());
    }

    @Test
    @DisplayName("Проверка сортировки одного элемента в списке")
    public void singleElementListTest() {
      List<Person> people = new ArrayList<>();
      NameSorter nameSorter = new NameSorter();

      people.add(new Person("John"));
      nameSorter.sort(people);

      Assertions.assertEquals("John", people.get(0).getName());
    }
}
