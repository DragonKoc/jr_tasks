package level04.lecture16;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */
/*
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить среднее из трех чисел.
•	Если все числа равны, вывести любое из них.
•	Если два числа из трех равны, вывести любое из двух.
*/
import java.io.*;
import java.util.Arrays;

public class task0441 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(number);
        System.out.println(number[1]);

        //System.out.println((a + b + c - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c)))
//        int mid; // Среднее
//        else if ((b - a) * (b - c) <= 0) mid = b;
//        else if ((c - a) * (c - b) <= 0) mid = c;
//        else mid = a;
    }

}
