package level04.lecture07;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число

Требования:
•	Программа должна считывать одно число c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Программа должна выводить только строку-описание числа и больше ничего.
•	Если число четное и имеет одну цифру, вывести    ное двузначное число".
•	Если число четное и имеет три цифры, вывести "четное трехзначное число".
•	Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
•	Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
*/


import java.io.*;

public class task0427 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        String len = null;

        if (a > 999 || a < 1)
            return;
        else {
            if (a >= 1 && a < 10)
                len = " однозначное ";
            else if (a > 9 && a < 100)
                len = " двузначное ";
            else if (a >= 100 && a < 1000)
                len = " трехзначное ";

            if (a % 2 == 0 && a > 0)
                System.out.println("четное" + len + "число");
            else if (a % 2 != 0 && a > 0)
                System.out.println("нечетное" + len + "число");
        }
    }
}