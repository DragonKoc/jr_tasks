package level03.lecture08;

/**
 * Created by Kgrebenyuk on 04.01.2019.
 */

/*
Большая и чистая
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя name1.
•	Выведенный текст должен содержать введенное имя name2.
•	Выведенный текст должен содержать введенное имя name3.
•	Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;

public class task0322 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader InputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(InputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
        String letter = "п";
        System.out.println(letter);

    }
}