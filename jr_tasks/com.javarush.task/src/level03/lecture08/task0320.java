package level03.lecture08;

/**
 * Created by Kgrebenyuk on 04.01.2019.
 */

/*
Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;

public class task0320 {

//    InputStream inputStream = System.in;
//    Reader InputStreamReader = new InputStreamReader(inputStream);
//    BufferedReader bufferedReader = new BufferedReader(InputStreamReader);

    public static void main(String[] args) throws Exception {
        InputStream instream = System.in;
        Reader InputStreamReader = new InputStreamReader(instream);
        BufferedReader buffreader = new BufferedReader(InputStreamReader);

        String var = buffreader.readLine();

        System.out.println(var + " зарабатывает $5,000. Ха-ха-ха!");

    }
}
