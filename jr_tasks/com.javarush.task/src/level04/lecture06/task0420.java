package level04.lecture06;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить три числа разделенных пробелами.
•	Программа должна выводить числа в порядке убывания.
*/

import java.io.*;

public class task0420 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a >= b && a >=c) {
            System.out.print(a + " ");
            if (b >= c) {
                System.out.print(b + " ");
                System.out.print(c);
            } else {
                System.out.print(c + " ");
                System.out.print(b);
            }
        } else if (b >= a && b >= c) {
            System.out.print(b + " ");
            if (a >= c) {
                System.out.print(a + " ");
                System.out.print(c);
            } else {
                System.out.print(c + " ");
                System.out.print(a);
            }
        } else if (c >= a && c >= b){
            System.out.print(c + " ");
            if (b >= a) {
                System.out.print(b + " ");
                System.out.print(a);
            } else {
                System.out.print(a + " ");
                System.out.print(b);
            }
        }

    }
}
