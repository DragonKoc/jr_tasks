package level02.lecture08;

/**
 * Created by Kgrebenyuk on 27.12.2018.
 */
/*
Печатаем трижды
Реализуй метод print3. Метод должен вывести переданную строку (слово) на экран три раза через пробел.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать функцию System.out.println или System.out.print.
•	Метод print3 должен выводить текст на экран.
•	Метод main должен вызвать метод print3 ровно два раза.
•	Метод print3 должен выводить переданную строку (слово) на экран три раза, но в одной строке.
*/
public class task0219 {
    public static void print3(String s) {
        System.out.print(s+" ");
        System.out.print(s+" ");
        System.out.print(s+" ");

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}