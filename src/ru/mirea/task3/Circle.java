package ru.mirea.task3;

import java.util.Random;
import java.util.Scanner;

public class Circle extends Point{
    Point point;
    int radius;
    public void SetCircle()
    {
        point.SetCoords();
        Random r = new Random();
        radius = r.nextInt(1, 100);
    }
}
