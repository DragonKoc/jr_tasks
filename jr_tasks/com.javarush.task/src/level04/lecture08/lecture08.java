package level04.lecture08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kgrebenyuk on 14.01.2019.
 */
public class lecture08 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int i = 3;
        String s;

        while (i >= 0)
            i = 0;

        boolean isExit = false;
        while (i < 3)
        {
            System.out.println(i);
            i--;    //уменьшение i на 1
        }


        {
            System.out.println(i);
            i++;   //увеличение i на 1
        }
       /* while (!isExit)

        {
             s = buffer.readLine();
            isExit = s.equals("exit"); //Программа будет вводить строки с клавиатуры, пока не будет введена строка «exit».
        }
        while (true)
            System.out.println("C");    //Программа будет вечно печатать на экран букву C.*/


        while (true)
        {
            s = buffer.readLine();
            if (s.equals("exit"))
                break;
        }

    }
}