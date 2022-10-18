package ru.mirea.task4;

public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values())
        {
            System.out.println("Температура " + season);
            season.setTemperature();
            season.getDescription();
        }
        Season season_1 = Season.Spring;
        season_1.SeasonLover();
    }
}
