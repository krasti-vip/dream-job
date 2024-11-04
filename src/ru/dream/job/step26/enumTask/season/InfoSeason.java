package ru.dream.job.step26.enumTask.season;

public class InfoSeason {

    public static void main(String[] args) {

        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription());
        }
    }
}
