package de.telran.hw20231012;

import java.util.Scanner;
public class NumberConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в 16-ричной системе : ");
        String numberStr = scanner.next();
        System.out.println("В 10-ричной системе исчисления оно равно = "+Integer.parseInt(numberStr,16));

        System.out.print("Введите число в 10-ричной системе : ");
        int numberInt = scanner.nextInt();
        System.out.println("В 16-ричной системе исчисления оно равно = "+Integer.toString(numberInt,16));

        System.out.print("Введите число в двоичной системе : ");
        numberStr = scanner.next();
        System.out.println("В 10-ричной системе исчисления оно равно = "+Integer.parseInt(numberStr,2));

        System.out.print("Введите число в 10-ричной системе : ");
        numberInt = scanner.nextInt();
        System.out.println("В двоичной системе исчисления оно равно = "+Integer.toString(numberInt,2));

    }
}


 /*1 уровень сложности: N1
         Переведите число 333 из 16-ричной в 10-ричную
         Переведите число 819 из 10-ричной в 16-ричную
         101101 в двоичной, переведите в 10-ричную
         124 в десятичной, переведите в 2-ичную
*/