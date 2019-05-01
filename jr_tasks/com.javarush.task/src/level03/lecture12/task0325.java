package level03.lecture12;

/**
 * Created by Kgrebenyuk on 08.01.2019.
 */
import com.sun.org.apache.xerces.internal.dom.DeferredEntityReferenceImpl;

import java.io.*;

/*
Финансовые ожидания
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час
*/

public class task0325 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader InputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(InputStreamReader);

        String name = bufferedReader.readLine();

        System.out.println("Я буду зарабатывать $"+name +" в час");


    }
}
