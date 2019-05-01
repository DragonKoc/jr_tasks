package level03.lecture04;

import java.math.*;
/**
 * Created by Kgrebenyuk on 03.01.2019.
 */

/*
Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.

Требования:
•	Программа должна выводить целое число на экран.
•	Метод main должен вызывать функцию System.out.println.
•	Выведенное число должно быть больше трех миллионов.
•	Выведенное число должно соответствовать заданию.
*/

public class task0308 {

      static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(1*2*3*4*5*6*7*8*9*10);
        System.out.println(calculateFactorial(10));
    }
}
