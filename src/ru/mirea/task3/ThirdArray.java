package ru.mirea.task3;

import java.util.Random;
import java.util.Scanner;

public class ThirdArray {
    int length;
    int[] array = new int [length];
    public void SetLength()
    {
        System.out.print("Введите длину массива: ");
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
        System.out.print("\n");
    }
    public void SetArray()
    {
        Random r = new Random();
        array = new int[length];
        for(int i = 0; i < length; i++)
        {
            array[i] = r.nextInt(1,101);
        }
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        int length_c = 0;
        for (int i = 0; i < length; i++)
        {
            if (array[i] % 2 == 0)
                length_c++;
        }
        int[] chet_arr = new int[length_c];
        int count = 0;
        for(int i = 0; i < length; i++)
        {
            if(array[i] % 2 == 0)
            {
                chet_arr[count] = array[i];
                count++;
            }
        }
        System.out.print("Массив чётных чисел: ");
        for (int i = 0; i < length_c; i++)
        {
            System.out.print(chet_arr[i] + " ");
        }
        System.out.print("\n");
    }
}
