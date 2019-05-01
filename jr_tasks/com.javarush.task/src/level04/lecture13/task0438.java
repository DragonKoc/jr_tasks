package level04.lecture13;

/**
 * Created by KGrebenyuk on 16.01.2019.
 */

/*
Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.

Требования:
•	Программа не должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить горизонтальную линию из 10 восьмёрок.
•	Программа должна выводить вертикальную линию из 10 восьмёрок.
•	В программе должен использоваться цикл for.
*/

public class task0438 {
    public static void main(String[] args) throws Exception {
//        int [] matrix1 = {1,2,3,4,5,6,7,8,9,10};
//        int [] matrix2 = {2,3,4,5,6,7,8,9,10};
//
//        for(int i=0; i<10; i++) {
//            System.out.print(matrix1[i]+" ");
//        }
//            System.out.println(" ");
//            for (int j = 1; j <10; j++) {
//                System.out.println(matrix1[j]+" ");
//
//            }
        int [] matrix1 = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<10; i++) {
            System.out.print(matrix1[7]);
        }
        System.out.println("");
        for (int j = 1; j <11; j++) {
            System.out.println(matrix1[7]);

        }

    }
}