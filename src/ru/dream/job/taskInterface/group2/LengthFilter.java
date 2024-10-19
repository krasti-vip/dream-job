package ru.dream.job.taskInterface.group2;

import java.util.ArrayList;
import java.util.List;

public class LengthFilter implements Filter {

    private final int minLength;

    public LengthFilter(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean apply(String value) {
        return value.length() > minLength;
    }

    public static List<String> filterStrings(List<String> strings, Filter filter) {
        List<String> filteredList = new ArrayList<>();

        for (String str : strings) {
            if (filter.apply(str)) {
                filteredList.add(str);
            }
        }

        return filteredList;
    }
}
