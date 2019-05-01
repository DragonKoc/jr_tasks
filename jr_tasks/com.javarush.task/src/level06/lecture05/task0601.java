package level06.lecture05;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */
public class task0601 {

/*
Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable.

Требования:
•	В классе Cat должен быть метод с именем finalize.
•	Метод finalize ничего не должен возвращать (void).
•	Метод finalize должен быть protected.
•	Метод finalize может кидать исключение Throwable, укажи это при объявлении метода.
*/

public static class Cat {

    protected void finalize() throws Throwable{

    }

    public static void main(String[] args) {

    }
}
}