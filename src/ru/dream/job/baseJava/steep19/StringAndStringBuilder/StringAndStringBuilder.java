package ru.dream.job.baseJava.steep19.StringAndStringBuilder;

public class StringAndStringBuilder {

    public boolean palidrom(StringBuilder stringBuilder) {
        if(stringBuilder.equals(stringBuilder.reverse())) {

            return true;
        }

        return false;
    }

    public String reversWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {

            return sentence;
        }
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i --) {
            reversedSentence.append(words[i]);
            if(i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public int countOccurrences(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        StringBuilder sb = new StringBuilder(str);
        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public String replaceSubstring(String str, String target, String replacement) {
        if (str == null || target == null || replacement == null) {
            return str;
        }

        return str.replace(target, replacement);
    }

    public String repeatString(String str, int n) {
        if (str == null || n <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
