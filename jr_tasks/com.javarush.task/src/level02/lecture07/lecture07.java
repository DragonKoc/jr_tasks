package level02.lecture07;

/**
 * Created by Kgrebenyuk on 27.12.2018.
 */

public class lecture07
{

    public static void main(String[] args)
    {

        print4("I like to move it, move it.");
        print3("s");
        //System.out.println(print3("s"));

        String a = print3("o");
        System.out.println(a);

        MethodCall methodCall = new MethodCall();
        System.out.println(methodCall.ResultMethod());

        MethodCall2 methodCall2 = new MethodCall2();
        System.out.println(methodCall2.ResultMethod2());

    }

    public static void print4(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    public static String print3(String a){
        String b = "!!!";
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
     return b;
    }
   //Вычисление минимума из двух чисел.
    public static class MethodCall
    {
        public static int ResultMethod()
        {
            int a = 5, b = 7;
            int m = min(a, b);
            System.out.println("Minimum is "+ m);
        return m;
        }

        public static int min(int c, int d)
        {
            int m2;
            if (c < d)
                m2 = c;
            else
                m2 = d;
        return m2;
        }
    }

    public static class MethodCall2
    {
        public static int ResultMethod2()
        {
            int a = 5, b = 7;
           // int c = a, d = b;
            int m2;
            if (a < b)
                m2 = a;
            else
                m2 = b;

            int m = m2;
            System.out.println("Minimum is "+ m);
            return m2;
        }
    }
}