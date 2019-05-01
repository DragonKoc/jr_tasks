package level03.lecture03;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */

/*
Обмен валют
Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс

Требования:
•	Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
•	Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
•	Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
*/

public class task0303 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100,5.14));
        System.out.println(convertEurToUsd(200,5.14));

    }

    public static double convertEurToUsd(int eur, double course) {
        Double res;
        return res = eur * course;
    }
}
