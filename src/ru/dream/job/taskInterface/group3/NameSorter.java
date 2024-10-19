package ru.dream.job.taskInterface.group3;

import java.util.Collections;
import java.util.List;

public class NameSorter implements Sortable<Person> {

    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public void sort(List<Person> people) {
        Collections.sort(people, (a, b) -> this.compare(a, b));
    }

}
