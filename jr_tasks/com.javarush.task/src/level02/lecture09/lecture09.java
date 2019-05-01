package level02.lecture09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Kgrebenyuk on 28.12.2018.
 */

public class lecture09
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream =
                new FileInputStream("c:\\data.txt");
        FileOutputStream fileOutputStream =
                new FileOutputStream("c:\\result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}