package test;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */
public class trash {

  /*      public static void main(String[] args) {
            int a = 1;
            int b = 2;

            System.out.println("a + b = " + (a + b));
            sum(a, b);
            System.out.println("a + b = " + (a + b));
        }

        public static void sum(int a, int b) {
            a = 5;
            b = 10;
            int sum = a + b;
        }*/
  public static void main(String[] args) {
      Cat cat = new Cat();

      System.out.println(cat.name);
      changeName(cat);
      System.out.println(cat.name);
  }

    public static String changeName(Cat cat) {
        cat.name = "Jerry";
        return cat.name;
    }

    public static class Cat {
        String name = "Tom";
    }
}


