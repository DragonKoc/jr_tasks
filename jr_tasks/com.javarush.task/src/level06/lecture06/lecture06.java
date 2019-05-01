package level06.lecture06;

/**
 * Created by Kgrebenyuk on 01.02.2019.
 */
public class lecture06 {

    static class Cat                 //класс
    {
        String name;                 //переменная

        Cat(String name)             //конструктор
        {
            this.name = name;        //инициализация переменной
        }
    }

    static class CatStatic       //класс
    {
        String name;             //обычная переменная
        static int catCount;     //статическая переменная

        CatStatic(String name)
        {
            this.name = name;
            CatStatic.catCount++; //увеличиваем значение статический переменной на 1
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska"); //создали один объект, его name содержит строку «Vaska»
        Cat cat2 = new Cat("Murka"); //создали один объект, его name содержит строку «Murka»
        System.out.println(cat1.name);
        System.out.println(cat2.name);
        /**********************************/
        System.out.println(CatStatic.catCount);
        CatStatic CatStatic1 = new CatStatic("Vaska");

        System.out.println(CatStatic.catCount);
        CatStatic CatStatic2 = new CatStatic("Murka");

        System.out.println(CatStatic1.name);
        System.out.println(CatStatic2.name);
        System.out.println(CatStatic.catCount);
    }
}
