package level04.lecture06;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Минимум двух чисел
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.*;
import java.util.Scanner;

public class task0418 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b)
            System.out.println(a);
        else if (a == b )
            System.out.println(a);
        else System.out.println(b);

    }
}