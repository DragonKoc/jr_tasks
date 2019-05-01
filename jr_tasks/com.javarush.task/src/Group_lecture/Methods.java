package Group_lecture;

/**
 * Created by Kgrebenyuk on 28.12.2018.
 */
/*
* Методы — это функционал твоего класса; то, что объекты этого класса умеют делать. С одним из методов ты уже знаком — это метод main().
* Но метод main, как ты помнишь, является статическим — то есть он принадлежит всему классу (логика такая же, как с переменными).
* */
public class Methods {

    public static class Cat {

        String name;
        int age;

        public void sayMeow() {
            System.out.println("Мяу!");
        }

        public void SpeedCat(int s) {
            System.out.println(s);
        }


        public void jump() {
            System.out.println("Прыг-скок!");
        }

        public void sayHi(String...names) {

            for (String name: names) {
                System.out.println("Добрый вечер, " + name + ", как ваши дела?");
            }
        }

        public static void main(String[] args) {
            Cat barsik = new Cat();
            barsik.age = 3;
            barsik.name = "Барсик";

            barsik.sayMeow();
            barsik.jump();
            barsik.SpeedCat(55);


            Jarvis jarvis = new Jarvis();
            jarvis.sayHi("Тони Старк", "Капитан Америка", "Черная Вдова", "Халк");

        }
    }
}
