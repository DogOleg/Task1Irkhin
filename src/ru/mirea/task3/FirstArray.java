package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;

public class FirstArray {
    public static void doSmth()
    {
        int length;
        Random r = new Random();
        length = (int) (Math.random() * 29) + 1;
        float[] array = new float [length];
        for (int i = 0; i < length; i++)
            array[i] = r.nextFloat(1, 57);
        System.out.println("Рандомный массив: ");
        for (int i = 0; i < length; i++)
            System.out.printf("%.02f\n ", array[i]);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < length; i++)
            System.out.printf("%.02f\n ", array[i]);
    }
}
