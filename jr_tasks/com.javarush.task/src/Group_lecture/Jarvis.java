package Group_lecture;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */
public class Jarvis {

    public void sayHi(String firstGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", как ваши дела?");
    }

    // перегрузка методов
    public void sayHi(String firstGuest, String secondGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
    }

    public void sayHi(String...names) {

        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

        public static void main(String[] args) {
            Jarvis jarvis = new Jarvis();
            jarvis.sayHi("Тони Старк","Alesha");
            jarvis.sayHi("Pupseg1","Pupseg2","Pupseg3","Pupseg4","Pupseg5");
        }


}
