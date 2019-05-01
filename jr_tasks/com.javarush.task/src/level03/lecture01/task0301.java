package level03.lecture01;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */

/*
Делиться полезно
Реализуй метод public static void div(int a, int b).
Метод должен делить первое число на второе, и выводить на экран результат деления а на b.
На экран должно быть выведено целое число.

Требования:
•	Функция div должна делить а на b.
•	Функция div должна выводить результат деления на экран.
•	Функция main должна вызывать функцию div 3 раза.
•	Функция main не должна вызывать команду вывода текста на экран.
•	Программа должна вывести три числа: 2 1 0. Каждое число в отдельной строке.
*/

public class task0301 {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }

    public static void div(int a, int b) {
        int res;
        res = a / b;
        System.out.println(res);
    }
}
