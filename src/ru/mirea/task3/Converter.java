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

        Scanner input = new Scanner(System.in);
        int var;

        do {
            System.out.print("Для перевода\nрублей в доллары введите 1\nрублей в евро введите 2\nдля завершения введите 3\n");
            var = input.nextInt();
            switch (var)
            {
                case 1:
                {
                    System.out.print("Введите рубли: ");
                    rubles = input.nextInt();
                    System.out.println(" = " + rubles*dollars + "$");
                    break;
                }
                case 2:
                {
                    System.out.print("Введите рубли: ");
                    rubles = input.nextInt();
                    System.out.println(" = " + rubles*euros + "э");
                    break;
                }

            }
        }while(var != 3);

    }
}
