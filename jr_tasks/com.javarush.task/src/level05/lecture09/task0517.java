package level05.lecture09;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class task0517 {

/*
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

Требования:
•	У класса Cat должна быть переменная name с типом String.
•	У класса Cat должна быть переменная age с типом int.
•	У класса Cat должна быть переменная weight с типом int.
•	У класса Cat должна быть переменная address с типом String.
•	У класса Cat должна быть переменная color с типом String.
•	У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

    public static class Cat {
        private String name = null;
        private int weight; //weight
        private int age;
        private String color = null;
        private String address = null;

        public Cat (String name) {
            this.name = name;
            this.weight = 5;
            this.age = 5;
            this.color = "black";
        }

        public Cat (String name, int weight, int age) {
            this.name = name;
            this.weight= weight;
            this.age = age;
            this.color = "black";
        }

        public Cat (String name, int age) {
            this.name = name;
            this.weight= 5;
            this.age = age;

        }

        public Cat (int weight, String color) {
            this.weight= weight;
            this.age = 5;
            this.color = color;
        }

        public Cat (int weight, String color, String address) {
            this.weight= weight;
            this.age = 5;
            this.color = color;
            this.address = address;
        }
        public static void main(String[] args) {

        }
    }

}
