package ru.mirea.task14_2;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String right = "abcdefghijklmnopqrstuv18340";
        String wrong = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340", right));
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340", wrong));
    }
}