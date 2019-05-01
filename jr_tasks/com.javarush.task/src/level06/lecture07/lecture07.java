package level06.lecture07;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */
public class lecture07 {

    public static class StaticClassExample
    {
        private static int catCount = 0;

        public static void main(String[] args) throws Exception
        {
            Cat vaska = new Cat("Bella");
            Cat murka = new Cat("Tiger");

            System.out.println("Cat count " + catCount);
        }

        public static class Cat
        {
            private String name;

            public Cat(String name)
            {
                this.name = name;
                StaticClassExample.catCount++;
            }
        }

    }
}
