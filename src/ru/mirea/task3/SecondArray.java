package ru.mirea.task3;

import java.util.Random;

public class SecondArray {
    int length = 4;
    int[] array = new int [length];
    public void SetArr()
    {
        Random r = new Random();
        for (int i = 0; i < length; i++)
        {
            array[i] = r.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
    public void IsItIncr()
    {
        int count = 0;
        for (int i = 1; i < length; i++)
        {
            if (array[i] > array[i-1])
                count++;
        }
        if (count == 3)
            System.out.println("Это возрастающая последовательность");
        else
            System.out.println("Это ерунда, а не последовательность");
    }
}
