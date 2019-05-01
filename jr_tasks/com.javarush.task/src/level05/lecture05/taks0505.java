package level05.lecture05;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */

/*
Кошачья бойня
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Нужно создать три объекта типа Cat.
•	Нужно провести три боя.
•	Программа должна вывести результат каждого боя с новой строки.
*/

public class taks0505 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska1", 10,10,10);
        Cat cat2 = new Cat("Vaska2", 13,13,13);
        Cat cat3 = new Cat("Vaska3", 15,15,15);

        if (cat1.fight(cat2) == true)
            System.out.println(cat1.name);
        else
            System.out.println(cat2.name);

        if (cat2.fight(cat3) == true)
            System.out.println(cat2.name);
        else
            System.out.println(cat3.name);

        if (cat3.fight(cat1) == true)
            System.out.println(cat3.name);
        else
            System.out.println(cat1.name);

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;
            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}