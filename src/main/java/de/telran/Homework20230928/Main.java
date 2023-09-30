package de.telran.Homework20230928;

public class Main {
    public static void main(String[] args) {
        String myStr = "I study Basic Java!";
        //String myStr = new String ("I study Basic Java!");

        System.out.println("myStr = " + myStr);
        System.out.println("предпоследний символ строки = " + myStr.charAt(myStr.length()-2));
        boolean isSubstring = myStr.contains("Java");
        System.out.println("строка содержит подстроку 'Java' = " + isSubstring);
        System.out.println("извлекаем подстроку = " + myStr.substring(14,18));
        System.out.println("заменяем символы 'a' на 'o' = " + myStr.replace('a','o'));
        System.out.println("преобразуем строку к верхнему регистру = " + myStr.toUpperCase());
        System.out.println("преобразуем строку к нижнему регистру = " + myStr.toLowerCase());

        int a = 15, b = 17;
        System.out.println("число a = " + a + ", число b = " + b);
        System.out.println("сложение (a+b)= " + add(a,b));
        System.out.println("вычитание (a-b) = " + sub(a,b));
        System.out.println("умножение (a*b)= " + mult(a,b));
        System.out.println("деление (a/b)= " + div(a,b));
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

    private static float div(int num1, int num2){
        return (float) num1 / num2;
    }

}


/*
         № 1
         Создайте строку через new - I study Basic Java!
         Распечатать пред-последний символ строки. Используем метод String.charAt().
         Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
         Вырезать строку Java c помощью метода String.substring().
         Заменить все символы “а” на “о”.
         Преобразуйте строку к верхнему регистру.
         Преобразуйте строку к нижнему регистру.

         № 2
         Создайте методы с математическими операциями +, -, *, /
         Каждый метод принимает два числа в параметрах и возвращает результат
         Вызовите все методы в main
         Результат распечатайте в консоль*/
