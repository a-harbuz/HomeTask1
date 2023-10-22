package de.telran.hw20231018;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Mssiv {
    public static void main(String[] args) {
        //Задание №1
        int[] arrInt = new int[8];
        Random random = new Random();

        for (int i = 0; i < arrInt.length; i++)
            arrInt[i] = random.nextInt(50)+1;

        System.out.println(Arrays.toString(arrInt));

        for (int i = 0; i < arrInt.length; i++)
            if (i % 2 != 0) arrInt[i] = 0;

        System.out.println(Arrays.toString(arrInt));

        //Задание №2
        int[] arr2Int = new int[5];
        for (int i = 0; i < arr2Int.length; i++)
             arr2Int[i] = random.nextInt(90) + 10;
        System.out.println(Arrays.toString(arr2Int));
        String str;
        str = isArrayGrowing(arr2Int) ? "" : "не ";
        System.out.printf("Массив arr2Int[] %sсо строго возрастающей последовательностью.", str);

    }


    static boolean isArrayGrowing(int[] arr){
        //определение строго возрастающей последовательности
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i] >= arr[i+1]) return false;
        return true;
    }
}

/* 1 уровень сложности: №1.
         Создайте массив из 8 случайных целых чисел из интервала [1;50]
         Выведите массив на консоль в строку.
         Замените каждый элемент с нечетным индексом на ноль.
         Снова выведете массив на консоль в отдельной строке.

         №2.
         Создайте массив из 5 случайных целых чисел из интервала [10;99]
         Выведите его на консоль в строку.
         Определите и выведите на экран сообщение о том, является ли массив строго
         возрастающей последовательностью.*/
