package level04.lecture06;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

Требования:
•	Программа должна считывать строки c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
•	Если возраст меньше либо равно 20 ничего не выводить.
*/

import javafx.beans.property.IntegerProperty;

import java.io.*;

public class task0423 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String age = bufferedReader.readLine();

        if (Integer.parseInt(age) > 20)
            System.out.println("И 18-ти достаточно");

    }
}
