package level05.lecture07;

/**
 * Created by Kgrebenyuk on 25.01.2019.
 */
public class task0510 {

/*
Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null).
То же касается адреса: null.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Cat должна быть переменная name с типом String.
•	У класса Cat должна быть переменная age с типом int.
•	У класса Cat должна быть переменная weight с типом int.
•	У класса Cat должна быть переменная address с типом String.
•	У класса Cat должна быть переменная color с типом String.
•	У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
•	У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public static class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name){
        this.name = name;
        this.age = 5;
        this.color = "red";
        this.weight = 5;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.color = "black";
        this.weight = weight;
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        this.color = "blue";
        this.weight = 10;
    }
    public void initialize (int weight, String color){
        this.age = 20;
        this.color = color;
        this.weight = weight;
    }
    public void initialize (int weight, String color, String address){
        this.age = 25;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }
    public static void main(String[] args) {

    }

}

}