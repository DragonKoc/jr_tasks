package level05.lecture09;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class task0522 {
/*
Максимум конструкторов
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.

Требования:
•	У класса должно быть хотя бы три переменные.
•	У класса должен быть конструктор по умолчанию.
•	У класса должен быть хотя бы один конструктор.
•	У класса должно быть хотя бы два конструктора.
•	У класса должно быть хотя бы три конструктора.
•	У класса должно быть хотя бы четыре конструктора.
*/

    public static class Circle {
        public double x;
        public double y;
        public double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public Circle(double x, double y) {
            this.x = x;
            this.y = y;
            this.radius = 10;
        }

        public Circle(double radius){
            this.x = 5;
            this.y = 5;
            this.radius = radius;
        }

        public  Circle(){
            this (5,5,5);
        }

        public static void main(String[] args) {

        }
    }
}
