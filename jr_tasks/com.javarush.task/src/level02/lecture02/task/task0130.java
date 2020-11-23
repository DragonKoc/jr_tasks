package level02.lecture02.task;

/**
 * Created by Kgrebenyuk on 24.12.2018.
 */

/*
Наш первый конвертер!
Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF - 32) * 5/9

Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 41.

Требования:
•	Метод convertCelsiumToFahrenheit(int) должен быть публичным и статическим.
•	Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
•	Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
•	Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.

Формула перевода может быть такой: double fahrenheit = 9 / 5.0 * celsium + 32.
*/

public class task0130 {
    public static void main(String[] args) {

        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double a = 9 / 5.0 * celsium + 32;

        return a;
    }
}