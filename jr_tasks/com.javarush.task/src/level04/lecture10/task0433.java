package level04.lecture10;

/**
 * Created by KGrebenyuk on 16.01.2019.
 */

/*
Гадание на долларовый счет
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS

Требования:
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить квадрат из 10х10 букв S.
•	В программе должен использоваться цикл while.
*/

import java.io.*;

public class task0433 {
    public static void main(String[] args) throws Exception {
        int n = 10;
        String a = "S";
        while (n > 0) {
            System.out.println(a + a + a + a + a + a + a + a + a + a);
            n += -1;
        }

    }
}
