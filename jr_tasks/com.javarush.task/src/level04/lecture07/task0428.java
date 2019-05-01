package level04.lecture07;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если положительных чисел нет, программа должна вывести "0".
•	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.*;

public class task0428 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int count = 0;

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a > 0 && a != 0)
            count++;
        if (b > 0 && b != 0)
            count++;
        if (c > 0 && c != 0)
            count++;

        System.out.println(count);


    }
}
