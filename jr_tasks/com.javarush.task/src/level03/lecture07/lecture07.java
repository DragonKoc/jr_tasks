package level03.lecture07;

import java.io.*;

/**
 * Created by Kgrebenyuk on 04.01.2019.
 */
public class lecture07 {

    public static void main(String[] args) throws IOException {

        //#1
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
//        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
//        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.

      //  System.out.println(nAge);
     //   System.out.println(sAge);
        System.out.println(name);

        //#2
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);*/

      /*  ScannerClass scanner = new ScannerClass(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();*/


    }
}
