package ru.mirea.task3;

import java.util.Scanner;

public class Circle extends Point{
    Point point;
    int radius;
    public void SetCircle()
    {
        point.SetCoords();
        System.out.println("Введите радиус");
        Scanner input = new Scanner(System.in);
    }
}
