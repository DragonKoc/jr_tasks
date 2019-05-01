package level06.lecture08;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0610 {

/*
Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.

Требования:
•	Метод readString должен считывать и возвращать строку(тип String).
•	Метод readInt должен считывать и возвращать число(тип int).
•	Метод readDouble должен считывать и возвращать дробное число(тип double).
•	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).
*/

    public static class ConsoleReader {
        public static String readString() throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();

        }

        public static int readInt() throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(bufferedReader.readLine());

        }

        public static double readDouble() throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return Double.parseDouble(bufferedReader.readLine());

        }

        public static boolean readBoolean() throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return Boolean.parseBoolean(bufferedReader.readLine());
        }

        public static void main(String[] args) throws Exception {

            String stroka = readString();
            int num = readInt();
            double dd = readDouble();
            boolean tf = readBoolean();

            System.out.println(stroka);
            System.out.println(num);
            System.out.println(dd);
            System.out.println(tf);

        }
    }

}
