package level04.lecture16;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */

/*
Как назвали, так назвали
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988

Требования:
•	Программа должна считывать строки c клавиатуры.
•	Программа должна выводить строки на экран.
•	Программа должна выводить текст, шаблон которого указан в задании.
•	Каждое предложение вывести с новой строки.
*/

import java.io.*;

public class task0443 {
    public static void main(String[] args) throws Exception {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       String name = bf.readLine();
       int y = Integer.parseInt(bf.readLine());
       int m = Integer.parseInt(bf.readLine());
       int d = Integer.parseInt(bf.readLine());

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);


    }
}
