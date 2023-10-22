package de.telran.hw20231016;

public class Temperature {
    public static void main(String[] args) {
        int temperature1 = 120;
        int temperature2 = 90;
        //if (isTempCorrect(temperature1, temperature2)) System.out.println("Прибор работает корректно");
        //else System.out.println("Прибор не будет работать корректно");
        System.out.printf("Прибор работает %sкорректно.%n",
                isTempCorrect(temperature1, temperature2) ? "" : "не");

/*        Teacher's comment: Отличная работа.
        Код
        if (checkDevice(temperature1, temperature2)) System.out.println("Прибор работает корректно");
        else System.out.println("Прибор не будет работать корректно");
        можно упростить
        System.out.printf("Прибор работает %sкорректно%n", checkDevice(temperature1, temperature2) ? "" : "не");
        Метод checkDevice лучше переименовать в isTempCorrect.*/

    }

    static boolean isTempCorrect(int temperature1, int temperature2){
        return temperature1>100 && temperature2<100;
    }
}

/*
            1 уровень сложности: №1.
         Представим, что у нас есть устройство, в котором две колбы.
         Прибор работает корректно, если температура первой колбы выше 100 градусов,
         а температура второй колбы меньше 100 градусов.
         Вы должны написать метод, который проверяет это устройство.
         Ваша программа должна иметь переменные temperature1 и temperature2.
         В результате метод возвращает true или false. */
