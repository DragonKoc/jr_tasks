package level04.lecture02;

/**
 * Created by Kgrebenyuk on 09.01.2019.
 */

/*
Как зовут кота?
*/

public class task0403 {

    public static class Cat {
        private String name = "безымянный кот";

        public void setName(String name) {
           this.name = name;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }
}