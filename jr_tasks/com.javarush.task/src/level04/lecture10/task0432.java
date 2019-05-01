package level04.lecture10;

/**
 * Created by KGrebenyuk on 16.01.2019.
 */

/*
Хорошего много не бывает
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв

Требования:
•	Программа должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить на экран строку N раз.
•	В программе должен использоваться цикл while.
*/

import java.io.*;

public class task0432 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String abc = bufferedReader.readLine();
        int n = Integer.parseInt(bufferedReader.readLine());

        while (n > 0){
            System.out.println(abc);
            n += -1;

        }


    }
}
