package level05.lecture12;

/**
 * Created by Kgrebenyuk on 31.01.2019.
 */
/*
Том и Джерри
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.

Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class task0527 {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat cat = new Cat("Tom", 15,5);
        Dog dog = new Dog("Sparky", 20,10);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        String name;
        int weight;
        int age;

        public Dog(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }


    public static class Cat{
        String name;
        int weight;
        int age;

        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }
}