package ru.mirea.task4_1;

import java.util.Scanner;

public class Matrix {
    int line;
    int collumn;
    int [][] array;

    public void SetSize()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер матриц");
        line = input.nextInt();
        collumn = input.nextInt();
    }

    public void SetMatrix()
    {
        System.out.println("Введите значения");
        Scanner input = new Scanner(System.in);
        array = new int [line] [collumn];
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < collumn; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
    }

    public void Plus(Matrix ob_1, Matrix ob_2)
    {
        int [][] result = new int[line][collumn];
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < collumn; j++)
            {
                result[i][j] = ob_1.array[i][j] + ob_2.array[i][j];
            }
        }
        System.out.println("Результат сложения");
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < collumn; j++)
                System.out.print(result[i][j] + " ");
            System.out.print("\n");
        }
    }

    public void Prod(Matrix ob_1, int num)
    {
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < collumn; j++)
                ob_1.array[i][j] = ob_1.array[i][j] * num;
        }
    }

    public void Out(Matrix ob_1)
    {
        System.out.println("Матрица");
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < collumn; j++)
                System.out.print(ob_1.array[i][j] + " ");
            System.out.print("\n");
        }
    }
}
