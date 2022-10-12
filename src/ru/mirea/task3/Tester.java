package ru.mirea.task3;

import java.util.Scanner;

public class Tester {
    Circle[] arrOfCircle;
    int length;
    public void SetLength()
    {
        System.out.println("Введите кол-во окружностей");
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
    }
    public void SetArr()
    {
        Circle[] arrOfCircle = new Circle[length];
    }
}
