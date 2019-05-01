package test;

/**
 * Created by Kgrebenyuk on 08.01.2019.
 */
public class l11_test {
    public static void main(String[] args)throws Exception {
        Cat cat = new Cat();
        int a = 5;
        String text = /*cat + a + */"Cat is " + cat + a;
        if (1!=2)
        System.err.println("Thor: " + text);
    }

    static class Cat{}
}
