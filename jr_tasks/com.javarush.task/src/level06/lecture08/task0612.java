package level06.lecture08;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */
public class task0612 {

/*
Калькулятор
*/

    public static class Calculator {
        public static int plus(int a, int b) {
            return a + b;
        }

        public static int minus(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double
        division(int a, int b) {
            return a / b;
        }

        public static double percent(int a, int b) {
            double z = (

                    (double) a / 100) * (double) b;
            return z;
        }

        public static void main(String[] args) {


            double o = percent(25, 200);
            double oo = division(34, 3);


            System.out.println(oo + " " + o);


        }
    }
}
