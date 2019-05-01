package level03.lecture12;

/**
 * Created by Kgrebenyuk on 08.01.2019.
 */

/*
Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод sumDigitsInNumber(int) должен быть публичным и статическим.
•	Метод sumDigitsInNumber должен возвращать значение типа int.
•	Метод sumDigitsInNumber не должен ничего выводить на экран.
•	Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

public class task0132 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        /*int a= number % 10;
        int b = number %100 / 10;
        int c = number % 1000 / 100;
        res = a+b+c;*/
        int b=8;
        b += (1+5);
        System.out.println(b);

        int res = 0;
        while(number != 0)
        {
            res += (number % 10);
            number/=10;
            System.out.println(res);

        }
        return res;
    }
}