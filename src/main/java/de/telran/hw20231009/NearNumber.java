package de.telran.hw20231009;

import java.util.Locale;
import java.util.Scanner;

public class NearNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Введите первое число m = ");
        double m = scanner.nextDouble();
        System.out.print("Введите второе число n = ");
        double n = scanner.nextDouble();

        double resultM = Math.abs(m-10); //в т.ч. устраняем проблему с отрицательными числами
        double resultN = Math.abs(n-10); //в т.ч. устраняем проблему с отрицательными числами

        if (resultM < resultN) {
            System.out.println("Число "+ m +" ближе к 10");
        } else if (resultM > resultN) {
            System.out.println("Число "+ n +" ближе к 10");
        } else System.out.println("Оба числа одинаково близки к 10");
    }
}
