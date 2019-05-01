package level03.lecture03;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */

/*
Немедленно в печать
Добавь метод public static void printString(String s), в нем напиши код, который будет выводить переданную строку на экран.

Требования:
•	Добавь метод printString, у которого аргумент имеет тип String.
•	Метод printString должен быть void.
•	Метод printString должен быть static.
•	Метод printString должен быть public.
•	Метод printString должен выводить переданный текст на экран.
•	Программа должна вывести "Hello, Amigo!".
*/
public class task0302 {

    public static void printString(String s){
        System.out.print(s);
    }

    public static void main(String[] args) {
        printString("Hello, Amigo!");
    }
}