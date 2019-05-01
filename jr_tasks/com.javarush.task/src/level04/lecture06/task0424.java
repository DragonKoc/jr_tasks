package level04.lecture06;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команды System.out.println() или System.out.print().
•	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
•	Если все числа разные, ничего не выводить.
*/

import java.io.*;

public class task0424 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a == b || b == c || c ==a) {
            if ((a + b) / b == 2)
                System.out.println(3);
            else if ((a + c) / c == 2)
                System.out.println(2);
            else if ((c + b) / c == 2)
                System.out.println(1);
        }
    }
}