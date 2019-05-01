package level07.lecture04;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна считывать 8 строк для массива с клавиатуры.
•	Программа должна выводить на экран 10 строк, каждую с новой строки.
•	Программа должна выводить на экран массив (10 элементов) в обратном порядке.
*/

public class task0702 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] name = new String[10];

        for (int i=0; i<=7;i++){
           name[i] = bufferedReader.readLine();
        }

        for (int i = name.length -1; i>=0 ;i--){
            System.out.println(name[i]);
        }


    }
}