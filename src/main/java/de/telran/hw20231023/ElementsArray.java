package de.telran.hw20231023;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ElementsArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(Arrays.toString(arr));
        findElement(arr);

        int[] arr1 = {6,1,2,8,3,4,7,10,5};
        System.out.println(Arrays.toString(arr1));
        findElement(arr1);

        // ===========================================
        // дополнительно - случайная генерация массива
        System.out.println("Введите целое число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr3 = new int[n-1]; //размер массива n-1
        int temp=0;
        Random random = new Random();
        int absent =  random.nextInt(n)+1;
        for (int i = 0; i < (n-1); i++){
            temp++;
            if (temp == absent) temp++;
            arr3[i] = temp;
        }
        //System.out.println(Arrays.toString(arr3));

        //перемешиваем массив
        int position, nextposition;
        for (int i = 0; i < 55; i++){

            position =  random.nextInt(n-1);
            nextposition = position + 1;

            if (nextposition >= arr3.length) nextposition=0;

            temp = arr3[nextposition];
            arr3[nextposition] = arr3[position];
            arr3[position] = temp;
        }

        System.out.println(Arrays.toString(arr3));
        findElement(arr3);

    }

    private static void findElement(int[] arr) {
        // поиск недостающего элемента
        //Arrays.sort(arr);
        int exp = 0;
        for (int i = 1; i <= (arr.length+1); i++) {
            exp += i;
        }

        int real=0;
        for (int i = 0; i <= (arr.length-1); i++) {
            real += arr[i];
        }

        System.out.println("Недостающий элемент "+(exp-real));
    }

}

/*
    Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
        input:
        arr[] = {1,2,3,5}
        out: 4

        arr[] = {6,1,2,8,3,4,7,10,5}
        out: 9*/
