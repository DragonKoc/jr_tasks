package level06.lecture05;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */
public class task0602 {

/*
Пустые кошки, пустые псы
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.

Требования:
•	В классе Cat должен быть void метод finalize.
•	В классе Dog должен быть void метод finalize.
•	В классах Cat и Dog не должно быть конструкторов или должны быть конструкторы без параметров.
•	Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
•	Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
*/

public static class Cat {
    public static void main(String[] args) {

    }

    public Cat(){
    }

    protected void finalize(){
        System.out.println("A Cat was destroyed");
    }

}

class Dog {
    protected void finalize(){
        System.out.println("A Dog was destroyed");
    }
}
}