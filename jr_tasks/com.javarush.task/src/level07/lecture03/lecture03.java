package level07.lecture03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */
public class lecture03 {
//    Заполнение массива из 10 чисел, числами от 1 до 10:
    public static class MainClass1
    {
        public static void main(String[] args)
        {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = i + 1;
            }
        }
    }
//    Заполнение массива из 10 чисел, числами от 10 до 1:
    public static class MainClass2
    {
        public static void main(String[] args)
        {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = 10 - i;
            }
        }
    }
//    Заполнение массива из 10 чисел, числами от 0 до 9:
    public static class MainClass3
    {
        public static void main(String[] args)
        {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = i;
            }
        }
    }
//    Заполнение массива из 10 чисел, числами от 9 до 0:
    public static class MainClass4
    {
        public static void main(String[] args)
        {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = 9 - i;
            }
        }
    }
//    Пример 2.
//    Ввод 10 строк с клавиатуры
    public static class MainClass5
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] list = new String[10];

            for (int i = 0; i < list.length; i++)
            {
                list[i] = reader.readLine();
            }
        }
    }
//    Ввод 10 чисел с клавиатуры
    public static class MainClass6
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] list = new int[10];

            for (int i = 0; i < list.length; i++)
            {
                String s = reader.readLine();
                list[i] = Integer.parseInt(s);
            }
        }
    }
//    Пример 3.
//    Вывод массива на экран
    public static class MainClass7
    {
        public static void main(String[] args) throws IOException
        {
            int[] list = new int[10];

            //заполнение массива
            for (int i = 0; i < list.length; i++)
                list[i] = i;

            //вывод на экран
            for (int i = 0; i < list.length; i++)
                System.out.println(list[i]);
        }
    }
//    Пример 4.
//    Быстрая (статическая) инициализация. Сумма элементов массива:
    public static class MainClass8
    {
        public static void main(String[] args) throws IOException
        {
            //это статическая инициализация
            int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

            //подсчёт суммы элементов
            int sum = 0;
            for (int i = 0; i < list.length; i++)
                sum += list[i];

            System.out.println("Sum is " + sum);
        }
    }
//    Пример 5.
//    Поиск минимального элемента в массиве:
    public static class MainClass10
    {
        public static void main(String[] args) throws IOException
        {
            int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

            int min = list[0];
            for (int i = 1; i < list.length; i++)
            {
                if (list[i] < min)
                    min = list[i];
            }

            System.out.println ("Min is " + min);
        }
    }
}
