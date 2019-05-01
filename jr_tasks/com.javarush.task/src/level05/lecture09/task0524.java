package level05.lecture09;

import com.sun.org.apache.xml.internal.security.encryption.CipherReference;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class task0524 {
/*
Основа колеса
В классе Circle создать конструктор который проинициализирует все переменные класса.
В конструкторе должно быть три аргумента.

Требования:
•	У класса Circle должны быть переменные x, y и r с типом double.
•	У класса должен быть один конструктор.
•	Конструктор должен быть public.
•	Конструктор должен иметь три параметра типа double.
•	Конструктор должен проинициализировать все переменные класса.
*/

    public static class Circle {
        public double x;
        public double y;
        public double r;

        public Circle(double x, double y, double r){
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public Circle(Circle circle){
            this.x = circle.x;

        }

        public static void main(String[] args) {

        }
    }

}
