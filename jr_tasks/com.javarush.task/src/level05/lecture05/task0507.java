package level05.lecture05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */

/*
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8
*/

public class task0507 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        float result =0;
        int count = 0;
        while (true) {

            int number =Integer.parseInt(bf.readLine());
            count++;
            if (number == -1){
                count--;
            break;}
            else
                result = result + number;
        }
        System.out.println(result / count);
    }
}