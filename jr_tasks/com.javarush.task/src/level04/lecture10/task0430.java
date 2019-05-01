package level04.lecture10;

/**
 * Created by KGrebenyuk on 16.01.2019.
 */

/*
От 1 до 10
Вывести на экран числа от 1 до 10 используя цикл while. Каждое значение с новой строки.

Требования:
•	Программа не должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить числа от 1 до 10.
•	В программе должен использоваться цикл while.
*/

import java.io.*;

public class task0430 {
    public static void main(String[] args) throws Exception {
        int n = 1;
        while (n <= 10){
            System.out.println(n);
            n += 1;
        }
    }
}