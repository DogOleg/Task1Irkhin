package ru.mirea.task4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Matrix ob_1 = new Matrix();
        Matrix ob_2 = new Matrix();
        ob_1.SetSize();
        ob_2.SetSize();
        ob_1.SetMatrix();
        ob_2.SetMatrix();
        ob_1.Out(ob_1);
        ob_2.Out(ob_2);
        ob_1.Plus(ob_1, ob_2);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите множитель");
        int num = input.nextInt();
        ob_1.Prod(ob_1, num);
        ob_1.Out(ob_1);
        System.out.println("Введите множитель");
        num = input.nextInt();
        ob_2.Prod(ob_2, num);
        ob_2.Out(ob_2);
    }
}
