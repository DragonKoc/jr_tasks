package level04.lecture06;

/**
 * Created by Kgrebenyuk on 11.01.2019.
 */

/*
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное из четырёх чисел.
•	Если максимальных чисел несколько, необходимо вывести любое из них.
*/

import java.util.Scanner;

public class task0419 {


    public static void main(String[] args) throws Exception  {

        Scanner sc = new Scanner(System.in);

        int result;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        result = WhatMax( WhatMax(a,b), WhatMax(c,d));

        System.out.println(result);
    }

    static int WhatMax (int a, int b){
        int t = 0;
        if (a > b)
            t = a;
        else
            t = b;

        return t;
    }

}
