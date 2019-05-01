package level06.lecture11;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить результат на экран.
•	Текст выведенный на экран должен начинаться с «The max is».
•	Текст выведенный на экран должен заканчиваться максимумом из 2х введенных чисел.
*/

public class task0620 {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max2 = a > b ? a : b;

        System.out.println(max + max2);
    }
}