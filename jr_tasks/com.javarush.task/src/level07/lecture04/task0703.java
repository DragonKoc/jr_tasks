package level07.lecture04;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать строки для массива с клавиатуры.
•	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
*/

public class task0703 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];
        String name[] = new String[10];

        for (int i=0;i<name.length;i++){
            name[i]=bufferedReader.readLine();
            num[i]= name[i].length();
        }

        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
}
