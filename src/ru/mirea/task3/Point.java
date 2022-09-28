package ru.mirea.task3;

import java.util.Scanner;

public class Point {
    int x,y;
    public void SetCoords()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        x = input.nextInt();
        y = input.nextInt();
    }
}
