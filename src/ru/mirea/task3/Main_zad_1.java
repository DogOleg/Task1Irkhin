package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main_zad_1 {
    public static void main(String[] args)
    {

        int a;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("1. Первое задание\n2. Второе задание\n3. Третье задание\n4. Оболочки\n5. Конвертер валют\n0. Выйти\n");
            a = input.nextInt();
            switch (a)
            {
                case 1:
                    FirstArray firstArray = new FirstArray();
                    firstArray.doSmth();
                    break;
                case 2:
                    SecondArray secondArray = new SecondArray();
                    secondArray.SetArr();
                    secondArray.IsItIncr();
                    break;
                case 3:
                    ThirdArray thirdArray = new ThirdArray();
                    thirdArray.SetLength();
                    thirdArray.SetArray();
                    break;
                case 0:
                    return;
                case 4:
                {
                    Double doub1 = Double.valueOf("0");
                    Double doub2 = Double.valueOf("0");
                    Double doub3 = Double.valueOf("0");
                    Double[] doub = { doub1, doub2, doub3 };
                    System.out.println("Введите дробное число");
                    String s;
                    Scanner in = new Scanner(System.in);
                    for (int i = 0; i < 3; i++)
                    {
                        s = in.nextLine();
                        doub[i] = Double.parseDouble(s);
                        System.out.println(doub[i]);
                    }
                    System.out.print("\n");
                    for (int i = 0; i < 3; i++)
                    {
                        byte k = doub[i].byteValue();
                        System.out.print(k + " ");
                    }
                    System.out.print("\n");
                    for (int i = 0; i < 3; i++)
                    {
                        float k = doub[i].floatValue();
                        System.out.print(k + " ");
                    }
                    System.out.print("\n");
                    for (int i = 0; i < 3; i++)
                    {
                        int k = doub[i].intValue();
                        System.out.print(k + " ");
                    }
                    System.out.print("\n");
                    for (int i = 0; i < 3; i++)
                    {
                        long k = doub[i].longValue();
                        System.out.print(k + " ");
                    }
                    System.out.print("\n");
                    for (int i = 0; i < 3; i++)
                    {
                        short k = doub[i].shortValue();
                        System.out.print(k + " ");
                    }
                    System.out.print("\n");
                    for (int i = 0; i < 3; i++)
                    {
                        String d = Double.toString(doub[i]);
                        System.out.print(d + " ");
                    }
                    break;

                }
                case 5:
                    Converter converter = new Converter();
                    converter.setCours();
                    converter.Convert();
                    break;
            }
        }while (true);
    }
}