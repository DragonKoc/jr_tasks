package test;

import java.util.Scanner;

public class myrem {
    public static String var1 = "var1111";
    String var2 = "var22222";


    public static void printtext(String a) {
        System.out.println(a);


    }

    public static void main(String[] agrs) {
        System.out.println("ping");
        Equals equals = new Equals();
        printtext(var1);
        String a = "a";
        System.out.println('5' + 5);
        System.out.println(5 + '2');
        System.out.println('5' + '7');
        System.out.println('5' + "2");

        System.out.println(equals.a.equals(equals.b));

        System.out.println("new----->");
        String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);
        System.out.println(str);
        int aa = scanner.nextInt();
        System.out.println(aa);
        int bb = scanner.nextInt();
        System.out.println(bb);
        int cc = scanner.nextInt();
        System.out.println(aa + bb + cc);

        int i = 0;
        while (i < 5)
        {
            System.out.println(i);
            i++;
        }


        for (i = 10; i >= 0; i= i - 2)
        {
            System.out.println(i);
        }
    }

    public static class Equals {
        String a = "Koc";
        String b = "Koc";

    }

}

