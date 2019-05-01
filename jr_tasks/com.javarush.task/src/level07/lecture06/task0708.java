package level07.lecture06;

import sun.security.util.Length;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	Инициализируй существующее поле strings класса Solution новым ArrayList<>
•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
•	Программа должна выводить самую длинную строку на экран.
•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class task0708 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //ArrayList<String> list = new ArrayList<>();
        strings = new ArrayList<>();


        for (int i=0; i < 5 ;i++){
            strings.add(bufferedReader.readLine());
        }

        String max="s";
        int longest=0;

        for (int a=0;a<5;a++){

            if (strings.get(a).length() > max.length()){
                max = strings.get(a);

            }

        }

        for (int k=0;k<5;k++){
            if (strings.get((k)).length()==max.length()){
                System.out.println(strings.get(k));
            }
        }

    }
}
