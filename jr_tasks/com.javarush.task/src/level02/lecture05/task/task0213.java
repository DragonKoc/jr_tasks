package level02.lecture05.task;

/**
 * Created by Kgrebenyuk on 24.12.2018.
 */

/*
Питомцам нужны люди
Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвой каждому животному владельца (owner).

Требования:
•	Программа не должна выводить текст на экран.
•	В методе main создай объекты типа Cat, Dog, Fish, Woman занеси их ссылки в переменные.
•	В методе main присвойте каждому животному владельца Woman.
•	Класс Cat, Dog, Fish должен содержать только одну переменную Woman owner.
•	Класс Woman не должен содержать переменных.
*/
public class task0213 {
    public static void main(String[] args) {
       Woman woman1 = new Woman();

       Cat cat = new Cat();
       Dog dog = new Dog();
       Fish fish = new Fish();

       cat.owner = woman1;
       dog.owner = woman1;
       fish.owner = woman1;

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}