package level03.lecture08;

/**
 * Created by Kgrebenyuk on 04.01.2019.
 */

/*
Предсказание на будущее

Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число1.
•	Выведенный текст должен содержать введенное число2.
•	Выведенный тест должен полностью соответствовать заданию.
input
Коля
3000
5
*/

import java.io.*;

public class task0319 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader InputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(InputStreamReader);

        String var = bufferedReader.readLine();
        String var2 = bufferedReader.readLine();
        String var3 = bufferedReader.readLine();

        System.out.println(var +" получает " + var2 +" через " + var3 + " лет");

    }
}
