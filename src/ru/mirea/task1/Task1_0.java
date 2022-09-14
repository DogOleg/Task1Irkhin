package ru.mirea.task1;

import java.util.Scanner;

public class Task1_0 {
    public static void main(String[] args) {
        int length = 0;
        System.out.println("Enter length\n");
        Scanner cin = new Scanner(System.in);
        length = cin.nextInt();
        int array[];
        array = new int [length];
        int sum = 0;
        System.out.println("Enter elements of array\n");
        for (int i = 0; i < length; i++)
        {
            array[i] = cin.nextInt();
        }
        for (int i = 0; i < length; i++)
        {
            sum = sum + array[i];
        }
        System.out.println("Sum by FOR " + sum + "\n");
        sum = 0;
        int count = 0;
        while (count < length)
        {
            sum = sum + array[count];
            count++;
        }
        System.out.println("Sum by WHILE " + sum + "\n");
        sum = 0;
        count = 0;
        do {
            sum = sum + array[count];
            count++;
        } while (count < length);
        System.out.println("Sum by DO WHILE " + sum + "\n");

    }
}
