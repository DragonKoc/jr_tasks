package level04.lecture04;

/**
 * Created by Kgrebenyuk on 10.01.2019.
 */

/*
Времена года на Терре
Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать функцию System.out.println или System.out.print.
•	Метод main должен вызывать метод checkSeason.
•	Метод checkSeason должен быть static void, и иметь только один параметр int.
•	Метод checkSeason должен выводить текст на экран согласно заданию.
*/

public class task0411 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month == 12 || month <= 2)
            System.out.println("зима");
        if (month > 2 && month <= 5)
            System.out.println("весна");
        if (month >= 6 && month <= 8)
            System.out.println("лето");
        if (month >= 9 && month <= 11)
            System.out.println("осень");
    }
}