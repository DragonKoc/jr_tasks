package level04.lecture04;

/**
 * Created by Kgrebenyuk on 10.01.2019.
 */

/*
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести числа на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
*/

import java.io.*;
import java.util.Scanner;

public class task0417 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a+b) - c == a && (a+c) - b == a && (c+b) - a == c)
            System.out.println(a+ " " + b + " " + c);
        else {
        if ((a+c) - a == a )
            System.out.println(a+ " " + c);
        if ((a+b) - a == a )
            System.out.println(a+ " " + b);
        if ((c+b) - c == c )
            System.out.println(c+ " " + b);}
    }
}