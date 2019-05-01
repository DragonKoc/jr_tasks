package level04.lecture13;

/**
 * Created by KGrebenyuk on 16.01.2019.
 */

/*
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить прямоугольник размером m на n из восьмёрок.
•	В программе должен использоваться цикл for.
*/

import java.io.*;

public class task0436 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        for (int v=m;v>0;v--) {
            for (int g=n; g > 1; g--) {
                System.out.print("8");
            }
            System.out.println("8");
        }

    }
}
