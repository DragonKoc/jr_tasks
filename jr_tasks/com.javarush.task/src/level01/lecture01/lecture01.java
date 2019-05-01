package level01.lecture01;

/**
 * Created by Kgrebenyuk on 20.12.2018.
 */

 import java.io.IOException;
/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59
 */
       // ИМЯ КЛАССА
public class lecture01
{
                                                           
    private static String TEXT = "Kiss my metal shiny ass"; // ПЕРЕМЕННАЯ КЛАССА
                                                          
                                                                   
    public static void main(String[] args) throws IOException
    {                                                            
        //ВЫВОД ТЕКСТА НА ЭКРАН       ОДНОСТРОЧНЫЙ КОММЕНТАРИЙ
        System.out.println(TEXT); //Выведет на экран одну строку  
        //МНОГОСТРОЧНЫЙ КОММЕНТАРИЙ
      /*                                                         
        Это многострочный комментарий.                           
        Код ниже выведет на экран три одинаковые строчки.         МЕТОД main()
       */                                                        
        //ОБЪЯВЛЕНИЕ ПЕРЕМЕННОЙ
        String s = "Ho-ho-ho!";                                    
        //ВЫЗОВ МЕТОДА
        printTextMoreTimes(s, 3);                                  
    }                                                             

    //АРГУМЕНТЫ МЕТОДА
    public static void printTextMoreTimes(String s, int count)   //ЗАГОЛОВОК МЕТОДА


    {                                                             
        //ЦИКЛ
        for (int i = 0; i < count; i++)                            
        //ТЕЛО ЦИКЛА                                                  ТЕЛО/КОД МЕТОДА
        {                                                          
            System.out.println(s);                                  
        }                                                          
    }                                                             

}