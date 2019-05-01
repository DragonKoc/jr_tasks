package level06.lecture03;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */
public class lecture03 {
    public static class Cat
    {
        String name;

        Cat(String name)
        {
            this.name = name;
        }

        protected void finalize() throws Throwable
        {
            System.out.println(name + " destroyed");
        }
    }
    public static void main(String[] args){
        Cat cat = new Cat("Валера");
        System.out.println(cat.name);
    }
}
