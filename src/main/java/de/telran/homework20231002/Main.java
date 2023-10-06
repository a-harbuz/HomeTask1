package de.telran.homework20231002;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String myStr1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String myStr2 = scanner.nextLine();

        String myStr3 = myStr1.substring(0,myStr1.length()/2) + myStr2.substring(myStr2.length()/2);
        System.out.println("Новое слово: "+myStr3);

        System.out.print("Введите первое целое число: ");
        int myNum1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int myNum2 = scanner.nextInt();

        System.out.println("число a = " + myNum1 + ", число b = " + myNum2);
        System.out.println("сложение (a+b)= " + add(myNum1,myNum2));
        System.out.println("вычитание (a-b) = " + sub(myNum1,myNum2));
        System.out.println("умножение (a*b)= " + mult(myNum1,myNum2));
        System.out.println("деление (a/b)= " + div(myNum1,myNum2));
    }

    private static int add(int num1, int num2){
        return num1 + num2;
    }

    private static int sub(int num1, int num2){
        return num1 - num2;
    }

    private static int mult(int num1, int num2){
        return num1 * num2;
    }

    private static double div(int num1, int num2){
        return (double) num1 / num2;
    }
}

/*
        №1
        Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
        Например:
        ввод - mama, papa
        вывод - mapa

        №2
        Реализовать программу, выводящую на экран результаты:
        Сложения двух чисел
        Вычитания двух чисел
        Умножения двух чисел
        Деления двух чисел
        Каждая из арифметических операций должна быть реализована как отдельный метод.*/
