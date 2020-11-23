package level02.lecture02;

import java.util.Date;

/**
 * Created by Kgrebenyuk on 21.12.2018.
 */
public class lecture02 {


    public static void main(String[] args) {

         class Person {
            String name;
            int age;
        }

         class Rectangle
        {
            int x, y, width, height;
        }

          class Cat
        {
            Person owner;
            Rectangle territory;
            int age;
            String name;
        }



        // ALESHA
        Person alesha = new Person();

        // Kitska
         Cat cat = new Cat();

        System.out.println(alesha.name);


        alesha.age = 25;
        alesha.name = "Aleks";

        System.out.println(alesha.name);

        cat.owner = alesha;
        cat.owner.age = 18;
        cat.owner.name = "Aleksey";

        Date data = new Date();
        System.out.println(data);

        System.out.println(alesha.name);
        System.out.println(cat.owner.name);

    }

}
