package de.telran.hw20231009;

import java.util.Random;

public class Clock {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801); // время до конца рабочего дня в секундах
        System.out.println("Время до конца рабочего дня " + n +" секунд.");
        int h = n/3600;

        if (n == 0){
            System.out.println("Рабочий день закончился.");
            return;
        }

        switch (h) {
            case 1:
                System.out.println("До конца рабочего дня осталось " + h +" час.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("До конца рабочего дня осталось " + h +" часа.");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("До конца рабочего дня осталось " + h +" часов.");
                break;
            default:
                System.out.println("До конца рабочего дня осталось менее часа.");
        }
    }
}
