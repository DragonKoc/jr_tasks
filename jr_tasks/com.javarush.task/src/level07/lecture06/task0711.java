package level07.lecture06;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры.
•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
•	Программа должна выводить список на экран, каждое значение с новой строки.
*/

public class task0711 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();


        for (int i=0; i < 5 ;i++){
            list.add(bufferedReader.readLine());
        }

        for (int k=0;k<13;k++){

             list.add(0,list.get(4));
             list.remove(5);

        }

        for (int koc=0;koc<5;koc++){
            System.out.println(list.get(koc));
        }



    }
}
