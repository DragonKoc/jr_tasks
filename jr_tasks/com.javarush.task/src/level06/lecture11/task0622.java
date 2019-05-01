package level06.lecture11;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

Требования:
•	Программа должна считывать 5 чисел с клавиатуры.
*/

public class task0622 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num[] = new int[5];

        for (int i=0; i < num.length;i++) {
            num[i] = Integer.parseInt(reader.readLine());;
        }

        Arrays.sort(num);

        for (int i=0; i < num.length;i++) {
            System.out.println(num[i]);
        }

    }
}
