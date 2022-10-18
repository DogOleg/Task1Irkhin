package ru.mirea.task4;

import java.util.Scanner;

public enum Season {
    Winter,
    Summer
            {
                @Override
                public void getDescription()
                {
                    System.out.println("Тёплое время года, средняя температура = " + temperature + "C");
                }
            },
    Spring,
    Autumn
    ;
    public void getDescription()
    {
        System.out.println("Холодное время года, средняя температура = " + temperature + "C");
    }
    int temperature;
    public void setTemperature()
    {
        Scanner input = new Scanner(System.in);
        temperature = input.nextInt();
    }
    public void SeasonLover()
    {
        Scanner input = new Scanner(System.in);
        String s;

        System.out.println("Введите время года");
        s = input.nextLine();
        if (s.equals("Spring")) {
            Season season = Spring;
            switch (season)
            {
                case Autumn:
                    System.out.println("Я люблю осень");
                    break;
                case Spring:
                    System.out.println("Я люблю весну");
                    break;
                case Summer:
                    System.out.println("Я люблю лето");
                    break;
                case Winter:
                    System.out.println("Я люблю зиму");
                    break;
            }
        }
        if (s.equals("Winter")) {
            Season season = Winter;
            switch (season)
            {
                case Autumn:
                    System.out.println("Я люблю осень");
                    break;
                case Spring:
                    System.out.println("Я люблю весну");
                    break;
                case Summer:
                    System.out.println("Я люблю лето");
                    break;
                case Winter:
                    System.out.println("Я люблю зиму");
                    break;
            }
        }
        if (s.equals("Autumn")) {
            Season season = Autumn;
            switch (season)
            {
                case Autumn:
                    System.out.println("Я люблю осень");
                    break;
                case Spring:
                    System.out.println("Я люблю весну");
                    break;
                case Summer:
                    System.out.println("Я люблю лето");
                    break;
                case Winter:
                    System.out.println("Я люблю зиму");
                    break;
            }
        }
        if (s.equals("Summer")) {
            Season season = Summer;
            switch (season)
            {
                case Autumn:
                    System.out.println("Я люблю осень");
                    break;
                case Spring:
                    System.out.println("Я люблю весну");
                    break;
                case Summer:
                    System.out.println("Я люблю лето");
                    break;
                case Winter:
                    System.out.println("Я люблю зиму");
                    break;
            }
        }

    }
}
