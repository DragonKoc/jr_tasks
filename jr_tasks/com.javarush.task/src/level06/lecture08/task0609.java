package level06.lecture08;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */
public class task0609 {

/*
Расстояние между двумя точками
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.

Требования:
•	Метод getDistance должен возвращать double.
•	Метод getDistance должен быть статическим.
•	Метод getDistance должен быть public.
•	Метод getDistance должен возвращать расстояние между точками.
•	Метод getDistance должен использовать метод double Math.sqrt(double a).
*/

public static class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }

    public static void main(String[] args) {

        double aa= 0;

        aa = getDistance(2,3,4,5);

        System.out.println(aa);

    }
}
}