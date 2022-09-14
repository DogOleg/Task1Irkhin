package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Task1_3 {
    public static void main (String[] args)
    {
        int array[];
        int length = (int) (Math.random() * 6) + 1;
        array = new int [length];
        for (int i = 0; i < length; i++)
        {
            array[i] = (int) (Math.random() * 29) + 1;
        }
        Arrays.sort(array);
        System.out.println("Math random");
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        Random r = new Random();
        length = r.nextInt(1,6);
        array = new int [length];
        for (int i = 0; i < length; i++)
        {
            array[i] = r.nextInt(1,29);
        }
        Arrays.sort(array);
        System.out.println("Random random");
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i] + " ");

        }
    }
}
