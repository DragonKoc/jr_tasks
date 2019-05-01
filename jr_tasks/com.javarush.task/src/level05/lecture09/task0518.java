package level05.lecture09;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class task0518 {
/*
Регистрируем собачек
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет

Требования:
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная height с типом int.
•	У класса Dog должна быть переменная color с типом String.
•	У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, рост и инициализирующий соответствующие переменные класса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, рост, цвет и инициализирующий соответствующие переменные класса.
*/


    public static class Dog {
        private String name;
        private int height;
        private String color;

        public Dog(String name){
            this.name = name;
        }

        public Dog(String name, int height){
            this.name = name;
            this.height = height;
            this.color = "red";
        }

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }

        public static void main(String[] args) {

        }
    }

}
