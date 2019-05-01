package Group_lecture;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */
/*
* "Когда мы вызываем метод changeInt(), и передаем туда нашу переменную int x = 15, в метод попадает не сама переменная x, а ее копия.
Ведь все изменения, которые происходят с копией, никак не влияют на нашу изначальную переменную x."
*/
public class TimeMachineReal {
    public static class Cat {

        int age;

        public Cat(int age) {
            this.age = age;
        }
    }

    public static class TimeMachine {

        public void goToFuture(Cat cat) {

            cat.age += 10;
        }

        public void goToPast(Cat cat) {

            cat.age -= 10;
        }
    }
    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();

        Cat barsik = new Cat(5);

        System.out.println("Сколько лет Барсику в самом начале работы программы?");
        System.out.println(barsik.age);// передача по ссылке

        timeMachine.goToFuture(barsik);
        System.out.println("А теперь?");
        System.out.println(barsik.age);

        System.out.println("Елки-палки! Барсик постарел на 10 лет! Живо гони назад!");
        timeMachine.goToPast(barsik);
        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(barsik.age);
    }
}
