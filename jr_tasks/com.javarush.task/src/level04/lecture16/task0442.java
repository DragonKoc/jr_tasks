package level04.lecture16;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */

/*
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказака: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
•	Программа должна посчитать сумму введенных чисел и вывести её на экран.
•	В программе должен использоваться цикл for, while или do-while.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class task0442 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        while (true) {
            int a = Integer.parseInt(bf.readLine());
            result = result + a;
            if (a == -1) {
                System.out.println(result);
                break;
            }
        }


    }
}
