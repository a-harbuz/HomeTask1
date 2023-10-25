package de.telran.hw20231023;

import java.util.Arrays;

public class sqlStr {
    public static void main(String[] args) {
        String[] strArr = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", "null", "active", "true"};
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM users WHERE ");

        for (int i = 0; i < (strArr.length-1); i+=2) {
            if (strArr[i+1] != "null"){
                sb.append(strArr[i]).append("=\'").append(strArr[i+1]).append("\' AND ");
            }
        }
        sb.delete((sb.length()-5), sb.length()).append(";");
        System.out.println(sb);
    }


}

/*
    Сформировать строку, сходную с  SQL запросом, используя StringBuilder:

        1) Берем исходную строку с данными из cars
        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
        Если значение второго параметра равно null с каждой пары, то параметр не должен попадать в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
        Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
        Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';
*/
