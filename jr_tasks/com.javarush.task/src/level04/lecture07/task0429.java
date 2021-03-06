package level04.lecture07;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить количество отрицательных чисел в исходном наборе.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
•	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
•	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.*;

public class task0429 {
    public static void main(String[] args) throws Exception {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       int countp = 0;
       int countm = 0;
       int a = Integer.parseInt(bf.readLine());
       int b = Integer.parseInt(bf.readLine());
       int c = Integer.parseInt(bf.readLine());

       if (a > 0 && a !=0)
           countp++;
       else if (a < 0) countm++;
       if (b > 0 && b !=0)
           countp++;
       else if (b < 0) countm++;
       if (c > 0 && c !=0)
           countp++;
       else if (c < 0) countm++;

        System.out.println("количество отрицательных чисел: "+countm);
        System.out.println("количество положительных чисел: "+countp);

    }
}