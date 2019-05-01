package level07.lecture04;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

Требования:
•	Метод initializeArray должен создавать массив из 20 целых чисел.
•	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
•	Метод max должен возвращать максимальный элемент из переданного массива.
•	Метод main изменять нельзя.
*/

public class task0701 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] num = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0;i < num.length;i++) {
            num[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return num;
    }

    public static int max(int[] array) {
        int[] aray = array;
        int t = aray[0];
        for (int i=0; i < aray.length; i++){
            if (t <= aray[i])
                t = aray[i];
            else
                t = t;
        }
        return t;
    }
}
