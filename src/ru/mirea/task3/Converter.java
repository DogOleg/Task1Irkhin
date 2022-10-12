package ru.mirea.task3;

import java.util.Scanner;

public class Converter {
    int dollars;
    int rubles;
    int euros;
    public void setCours()
    {
        System.out.println("Введите курс рубля к доллару");
        Scanner input = new Scanner(System.in);
        dollars = input.nextInt();
        System.out.println("Введите курс рубля к евро");
        euros = input.nextInt();
    }
    public void Convert()
    {
        System.out.print("Для перевода\nрублей в доллары введите 1\nрублей в евро введите 2\nдля завершения введите 3\n");
        Scanner input = new Scanner(System.in);
        int var;
        var = input.nextInt();
        do {
            switch (var)
            {
                case 1:
                {
                    System.out.print("Введите рубли: ");
                    rubles = input.nextInt();
                    System.out.print(" = " + rubles*dollars + "$");
                    break;
                }
                case 2:
                {
                    System.out.print("Введите рубли: ");
                    rubles = input.nextInt();
                    System.out.print(" = " + rubles*euros + "э");
                    break;
                }
                case 0:
                    return;
            }
        }while(true);

    }
}
