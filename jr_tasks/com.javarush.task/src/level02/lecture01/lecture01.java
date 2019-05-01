package level02.lecture01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// copy file
public class lecture01
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream  fileInputStream = new FileInputStream("c:\\clean.txt");
        FileOutputStream  fileOutputStream = new FileOutputStream("c:\\les.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}