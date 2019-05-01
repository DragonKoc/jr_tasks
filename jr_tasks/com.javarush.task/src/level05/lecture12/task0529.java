package level05.lecture12;

/**
 * Created by Kgrebenyuk on 31.01.2019.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в нижнем регистре и нажмет Enter.
•	Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
•	Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
•	Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
•	Программа должна выводить текст на экран.
*/

public class task0529 {
    public static void main(String[] args) throws Exception {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       int total = 0;

       while(true){
           String text = bufferedReader.readLine();
           if (text.equals("сумма")) {
               break;
           }
           total = Integer.parseInt(text) + total;

       }

       System.out.println(total);
    }
}
