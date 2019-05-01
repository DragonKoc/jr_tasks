package level04.lecture06;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если имена одинаковые вывести сообщение "Имена идентичны"
•	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
•	Если имена и длины имен разные - ничего не выводить.
*/

import java.io.*;

public class task0421 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
       InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

       String name1 =  bufferedReader.readLine();
       String name2 =  bufferedReader.readLine();

       if (name1.equalsIgnoreCase(name2))
        System.out.println("Имена идентичны");
       else if (name1.length() == name2.length())
       System.out.println("Длины имен равны");

    }
}
