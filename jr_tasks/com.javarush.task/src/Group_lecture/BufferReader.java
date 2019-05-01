package Group_lecture;

import java.io.*;

/**
 * Created by Kgrebenyuk on 04.01.2019.
 */
/*
* System.in — это объект класса InputStream, о котором мы говорили в начале. Это входящий поток, и он привязан к системному устройству ввода данных — клавиатуре.
* В классе InputStream (а System.in, напомню, является объектом класса InputStream) есть метод read(), который позволяет считывать данные.
*
*
* Мы передаем поток System.in объекту InputStreamReader - “считыватель входящих потоков”.
* InputStreamReader не только получает данные из потока. Он еще и преобразует байтовые потоки в символьные.
*
* BufferedReader при считывании данных использует специальную область — буфер, куда “складывает” прочитанные символы.
* В итоге, когда эти символы понадобятся нам в программе — они будут взяты из буфера, а не напрямую из источника данных
* (клавиатуры, файла и т.п.), а это экономит очень много ресурсов.
*
* */
public class BufferReader {

    public static void main(String[] args) throws IOException {

     /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String olo = reader.readLine();
        System.out.println(olo);*/

//        System.in.read
       /* while (true) {
            int x = System.in.read();
            System.out.println(x);
        }
        */
//       InputStreamReader(System.in)
       /*  InputStreamReader reader = new InputStreamReader(System.in);
       while (true) {
           int x = reader.read();
           System.out.println(x);
           char y = 1071;
           System.out.println(y);
       }*/

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\testFile.txt"));
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String var = reader.readLine();
        String var2 = reader.readLine();
        String var3 = reader.readLine();
        String var4 = reader.readLine();
        System.out.println(var);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }

}
