package level02.lecture08;

/**
 * Created by Kgrebenyuk on 27.12.2018.
 */
/*
Повторенье-мать
Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать функцию System.out.println или System.out.print.
•	Метод print3 должен выводить текст на экран.
•	Метод main должен вызвать метод print3 только один раз.
•	Метод print3 должен выводить на экран строку 3 раза. Каждый раз с новой строки.
*/
public class task0218 {
    public static void print3(String s) {
       System.out.println(s);
       System.out.println(s);
       System.out.println(s);

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}