package level04.lecture04;

/**
 * Created by Kgrebenyuk on 10.01.2019.
 */

/*
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить текст на экран.
•	Если введено число от 1 до 7, необходимо вывести день недели.
•	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
*/

import java.io.*;
import java.util.Scanner;

public class task0413 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        if (x < 1 || x > 7)
            System.out.println("такого дня недели не существует");

        if (x == 1)
            System.out.println("понедельник");
        if (x == 2)
            System.out.println("вторник");
        if (x == 3)
            System.out.println("среда");
        if (x == 4)
            System.out.println("четверг");
        if (x == 5)
            System.out.println("пятница");
        if (x == 6)
            System.out.println("суббота");
        if (x == 7)
            System.out.println("воскресенье");

    }
}