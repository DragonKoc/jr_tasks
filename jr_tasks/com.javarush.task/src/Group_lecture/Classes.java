package Group_lecture;

/**
 * Created by Kgrebenyuk on 28.12.2018.
 */
/*
* Класс — это, по сути, шаблон для объекта. Он определяет, как объект будет выглядеть и какими функциями обладать. Каждый объект является объектом какого-то класса.
* */
public class Classes {

    public static class Cat {

        String name;
        int age;

        static int count = 0; //Эта переменная обозначена ключевым словом static. Это значит, что она принадлежит классу, а не конкретному объекту класса.


        public static void main(String[] args) {
            Cat barsik = new Cat(); //Field1 //переменные экземпляра
            barsik.age = 3;         //Field2
            barsik.name = "Барсик"; //Field3
            count++;

            Cat vasia = new Cat();
            vasia.age = 5;
            vasia.name = "Вася";
            count++;

            System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
            System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);

            System.out.println("Общее количество котов = " + count);
        }

    }
}
