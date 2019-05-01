package level02.lecture05;

import java.util.Date;

/**
 * Created by Kgrebenyuk on 24.12.2018.
 */
public class lecture05 {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = "";    //Создание двух идентичных пустых строк.
        int a ;    //Создание переменной типа int;
        a = 5;
        int c = 5;    //Создание переменной a типа int, установка её значения равным 5
        int d = 5, b = 6;    //Создание переменной a типа int, установка ей значения 5 Создание переменной b типа int, установка ей значения 6
        int f = 5, g = c + 1;    //Создание переменной a типа int, установка ей значения 5 Создание переменной b типа int, установка ей значения 6
        Date date = new Date();//	Создание объекта типа «Дата». В каждый объект типа «дата» после создания заносится текущее время и дата.
        boolean isTrue = true;    //Переменная логического типа инициализируется значением true (истина)
        boolean isLess = (5 > 6);    //В переменную isLess заносится значение false (ложь). Других значений тип boolean не принимает.
        System.out.println(s1 + s2 + a + b +c +d +f +g +isTrue + isLess + "\n"+ date);
    }
}