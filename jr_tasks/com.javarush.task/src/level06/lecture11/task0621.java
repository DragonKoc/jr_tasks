package level06.lecture11;

/**
 * Created by Kgrebenyuk on 04.02.2019.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

Требования:
•	Программа должна считывать имена 6 котов в указанном порядке.
•	Метод main должен создавать 6 объектов типа Cat.
•	Программа должна выводить 6 строк с информацией о котах.
•	Строка про дедушку (первая) должна соответствовать условию.
•	Строка про бабушку (вторая) должна соответствовать условию.
•	Строка про папу (третья) должна соответствовать условию.
•	Строка про маму (четвертая) должна соответствовать условию.
•	Строка про сына (пятая) должна соответствовать условию.
•	Строка про дочь (шестая) должна соответствовать условию.
*/

public class task0621 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        String grandmotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();


        Cat catGrandFather = new Cat(grandfatherName);
        Cat catGandmother = new Cat(grandmotherName);
        Cat catMother = new Cat(motherName, catGandmother,null);
        Cat catFather = new Cat(fatherName,null,  catGrandFather);
        Cat catSon = new Cat(sonName, catMother, catFather);
        Cat catDaughter = new Cat(daughterName, catMother, catFather);



        System.out.println(catGrandFather);
        System.out.println(catGandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);


    }

    public static class Cat {
        private String name;
        private Cat mom;
        private Cat father;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mom, Cat father) {
            this.name = name;
            this.mom = mom;
            this.father = father;
        }


         @Override
        public String toString()  {
            if (mom == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            if (mom == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            if (father == null)
                return "The cat's name is " + name + ", mother is " + mom.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mom.name + ", father is " + father.name;
        }
    }

}
