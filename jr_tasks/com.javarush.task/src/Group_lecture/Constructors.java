package Group_lecture;

/**
 * Created by Kgrebenyuk on 02.01.2019.
 */
public class Constructors {

    public static class Cat {

        String name;
        int age;
        static int count = 0;

        //для домашних котов
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //для уличных котов
        public Cat() {
            count++;
            this.name = "Уличный кот номер " + count;
        }

        public Cat (String name){
            this.toString();
        }

        public static void main(String[] args) {

           // Cat barsik = new Cat(); //ошибка! компилятор Java знает, как должны выглядеть объекты, и не позволяет создавать объекты без указанных в нем аргументов.
            Cat barsik = new Cat("Барсик", 5);
            Cat alesha = new Cat("trolo");


            System.out.println(barsik.name);
                System.out.println(barsik.age);

            Cat cat = new Cat("Vaska");
            String catText = cat.toString();
            System.out.println("Cat is " + catText);
            //Стандартный метод toString() класса Object возвращает строку, состоящую из имени класса и адреса объекта в памяти (в шестнадцатеричном виде)
        }
    }
}
