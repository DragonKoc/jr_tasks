package level03.lecture08;

/**
 * Created by Kgrebenyuk on 04.01.2019.
 */

/*
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число.
•	Выведенный текст должен полностью соответствовать заданию.
*/

import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import java.io.*;

public class task0318 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader InputStrReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(InputStrReader);

        String year = bufferedReader.readLine();
        String name = bufferedReader.readLine();


        int yr;
        yr = Integer.parseInt(year);

        System.out.println(name + " захватит мир через "+yr+" лет. Му-ха-ха!");
    }
}
