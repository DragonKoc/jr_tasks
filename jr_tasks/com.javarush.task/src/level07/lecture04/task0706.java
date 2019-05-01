package level07.lecture04;

/**
 * Created by Kgrebenyuk on 07.02.2019.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.

Требования:
•	Программа должна создавать массив на 15 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
•	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
*/

public class task0706 {
    public static void main(String[] args) throws Exception {
        int[] num = new int[15];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int countch = 0;
        int ncountch = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < num.length; i++) {
           if (i%2 == 0)
               countch = countch + num[i];
           else
               ncountch = ncountch + num[i];
        }
        System.out.println(countch);
        System.out.println(ncountch);
        if (countch < ncountch)
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
        System.out.println("В домах с четными номерами проживает больше жителей.");



    }
}