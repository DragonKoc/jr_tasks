package level05.lecture05;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */
public class task0502 {

/*
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false

Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы.
*/

    public static class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }

        public boolean fight(Cat anotherCat) {
            if(this.age + weight * strength > anotherCat.age + weight * strength)
                return true;
            else
                return false;
        }

        public static void main(String[] args) {

        }

    }
}