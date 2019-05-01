package level05.lecture12;

/**
 * Created by Kgrebenyuk on 31.01.2019.
 */
import java.io.*;

/*
Шеф, что-то не пашет
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	В классе должен быть только один метод main.
•	Программа должна выводить строку, которая начинается на "Sum = ".
•	Программа должна выводить строку, которая заканчивается суммой введенных чисел.
*/

public class task0530 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();

        int sum = 0;

        sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("Sum = " + sum);
    }
}
