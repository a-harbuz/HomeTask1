package de.telran.hw20231012;

import java.util.Locale;
import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {
        int caloriesSmkv = 40;
        double square24 = Math.PI*(24^2);
        double square28 = Math.PI*(28^2);
        System.out.println("лишних калорий будет = "+(square28-square24)*caloriesSmkv);

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Введите сумму в EUR для конвертации : ");
        System.out.println("Сумма в USD = " + convertEurUsd(scanner.nextDouble()));
    }

    static double convertEurUsd(double argEur) {
        double courseEurUsd = 1.0796;
        return argEur * courseEurUsd;
    }

}

/*
N2
    Напишите программу, которая вычисляет, сколько лишних калорий будет,
        если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
        Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр
        пиццы содержит 40 калорий.
N3
        Программа запрашивает у пользователя сумму в Евро для конвертации
        Реализовать метод, который конвертирует полученную сумму в сумму в долларах США*/
