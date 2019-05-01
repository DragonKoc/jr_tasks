package level05.lecture12;

/**
 * Created by Kgrebenyuk on 31.01.2019.
 */
import java.io.*;

/*
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	Программа должна выводить число на экран.
•	В классе должен быть метод public static void main.
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить на экран максимальное из введенных N чисел.
*/

public class task0532 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        int N = Integer.parseInt(reader.readLine());
        if (N<=0) return;

        int a;
        maximum = Integer.parseInt(reader.readLine());
        for (int i=0; i<N-1;i++) {
            a = Integer.parseInt(reader.readLine());
            if (a>maximum) {
                maximum = a;
            }
        }

        System.out.println(maximum);
    }
}
