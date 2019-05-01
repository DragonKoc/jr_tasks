package level07.lecture04;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести его на экран.
*/

public class task0705 {
    public static void main(String[] args) throws Exception {
        int[] num = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

              System.arraycopy(num, 0, num1, 0, 10);
              System.arraycopy(num, 10, num2, 0, 10);

       for (int i=0;i<10;i++){
           System.out.println(num2[i]);
       }


    }
}
