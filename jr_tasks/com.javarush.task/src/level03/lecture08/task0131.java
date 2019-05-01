package level03.lecture08;

/**
 * Created by Kgrebenyuk on 04.01.2019.
 */

/*
Полнометражная картина
Реализуй метод getMetreFromCentimetre(int centimetre).
Метод на вход принимает количество сантиметров. Нужно сделать так, чтобы метод возвращал число полных метров в centimetre. (1 метр = 100 см).

Пример:
Метод getMetreFromCentimetre вызывается с параметром 243.

Пример вывода:
2

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод getMetreFromCentimetre(int) должен быть публичным и статическим.
•	Метод getMetreFromCentimetre должен возвращать значение типа int.
•	Метод getMetreFromCentimetre не должен ничего выводить на экран.
•	Метод getMetreFromCentimetre должен правильно возвращать количество полных метров в centimetre.
*/

public class task0131 {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
        System.out.println(like("textvkotoromnado chtoto nayyti2225555","2"));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int res = centimetre / 100;
        return  res;
    }


    public static String likeString (String text){
        String result = null;



        return result;
    }

    public static String like(String str, String expr) {
        String text = null;
       //text.startsWith(expr); // like "app%"
       // text.endsWith("le"); // like "%le"
      //  text.contains(expr); // like "%ppl%"
        if (str.contains(expr) ==true)
            text = "Yeap!";
                    else
                        text = "Nope";

        return text;
    }
}