package level04.lecture13;

/**
 * Created by KGrebenyuk on 16.01.2019.
 */

/*
Треугольник из восьмерок
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

Требования:
•	Программа не должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
•	В программе должен использоваться цикл for.
*/

public class task0437 {
    public static void main(String[] args) throws Exception {
        int n =8;

        for (int i=0;i<10;i++){
            for (int b=0;b<=i;b++) {
                System.out.print(n);
            }
            System.out.println(" ");

        }

    }
}
