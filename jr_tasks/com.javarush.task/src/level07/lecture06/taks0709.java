package level07.lecture06;

import sun.security.util.Length;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
        import java.util.ArrayList;
import java.util.Collection;

/*
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
•	Программа должна выводить самую короткую строку на экран.
•	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

public class taks0709 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i=0;i<5;i++){
            list.add(bufferedReader.readLine());
        }

        int min = Integer.MAX_VALUE;

       for (int k=0;k<list.size();k++){

           int count = list.get(k).length();

           if(count < min){
               min = count;
           }

       }

       for (int k=0;k<list.size();k++){
           if (list.get(k).length() == min){
               System.out.println(list.get(k));
           }
       }


    }
}
