package ru.mirea.task1;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter number");
        Scanner enter = new Scanner(System.in);
        num = enter.nextInt();
        int result = factorial(num);
        System.out.println("Factorial == " + result);
    }
    public static int factorial(int num)
    {
        int result = 1;
        for (int i = 1; i <= num; i++)
        {
            result = result * i;
        }
        return result;
    }
}
