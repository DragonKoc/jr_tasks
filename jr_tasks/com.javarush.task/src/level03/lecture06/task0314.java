package level03.lecture06;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */

/*
Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 10 строк.
•	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
•	Выведенные числа должны быть таблицей умножения.
*/

public class task0314 {


   public static void method(int...s){
        for (int ss: s){
        System.out.print(ss+" ");
        };
    }

    public static void method2(int...s){
        for (int ss: s){
            System.out.println(ss+" ");
        };
    }


    public static void main(String[] args) {

/*
     method(1,2,3,4,5,6,7,8,9,10);
     System.out.println("");
     method2(2,3,4,5,6,7,8,9,10);
*/

       int [] matrix1 = {1,2,3,4,5,6,7,8,9,10};
       int [] matrix2 = {2,3,4,5,6,7,8,9,10};

        for(int i=0; i<10; i++) {
            System.out.print(matrix1[i]+" ");
            for (int j = 1; j < 10; j++) {
                System.out.print(matrix1[i] * matrix1[j]+" ");

            }
            System.out.println(" ");
        }
    }
}
