package de.telran.hw20231011;

import java.util.Scanner;

public class Shops {
    public static void main(String[] args) {
        // Task-1
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        System.out.println("Я могу купить еду, это …… "+canBuy(isEdekaOpen, isReweOpen));

        // Task-2
        System.out.print("Введите год : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (isLeap(year))System.out.println("Этот год высокосный!");
        else System.out.println("Этот год невысокосный!");

        // Task-3
        System.out.print("Введите первое целое число : ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число : ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье целое число : ");
        int num3 = scanner.nextInt();
        if (num1>num2 && num1>num3) System.out.print("Максимальное число : "+num1);
        else if (num2>num1 && num2>num3) System.out.print("Максимальное число : "+num2);
        else if (num3>num1 && num3>num2) System.out.print("Максимальное число : "+num3);
        else if (num1==num2 && num1==num3) System.out.print("Все числа равны!");
        else System.out.print("Нету максимального числа!");
        }

    static boolean canBuy(boolean shop1, boolean shop2) {
        // проверка, открыт ли хоть какой-нибуть магазин или нет
        if (shop1 || shop2 ) return true;
        return false;
    }

    static boolean isLeap(int year) {
        //проверяет високосный год или нет
        if (year > 1584 &&
                ((year % 400 == 0) ||
                 (year %4 == 0 && year % 100 != 0)
                )
           ) return true;
        return false;
    }

}


/*
    Описание задания.
        11.10.2023
        1) Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
        открыты магазины или нет.
        Реализует логический метод canBuy,  возвращающий boolean
        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
        Отобразите строку «Я могу купить еду, это ……» и значение.

        2) Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год.
        Метод isLeap проверяет високосный год или нет.

        3) Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер). Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
        Напечатает максимум из трех чисел.
*/
