package level05.lecture07;

/**
 * Created by Kgrebenyuk on 25.01.2019.
 */
public class task0515 {

/*
Инициализация объектов
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Person должно быть 5 переменных.
•	У класса должен быть один метод initialize.
•	Метод initialize должен иметь пять параметров.
*/

    public static class Person {
        String name;
        char sex;
        int money;
        int weight;
        double size;


        public void initialize(String name, int money, char sex, int weight, double size) {
            this.name = name;
            this.money = money;
            this.sex = sex;
            this.weight = weight;
            this.size = size;
        }
    }

    public static void main(String[] args) {
        Person olero = new Person();
        olero.money = 5000;

        System.out.println(olero.money);

        Person igi = new Person();
        igi.initialize("Igor",0, 'M',12,6);

        System.out.println(igi.name);

    }
}