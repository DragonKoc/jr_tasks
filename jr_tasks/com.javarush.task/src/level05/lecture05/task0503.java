package level05.lecture05;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */
public class task0503 {


/*
Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/

static public class Dog {
    public String name;
    public int age = 5;

    public void setName (String name ){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge (){
        return this.age;
    }


    public static void main(String[] args) {

    }
}
}