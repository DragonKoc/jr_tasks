package level06.lecture01;

/**
 * Created by Kgrebenyuk on 31.01.2019.
 */

public class lecture01 {
//    public static void main (String[] args)
//    {
//    ┏ Tommy
//    ┃ Cat cat = new Cat("Tommy");
//    ┃ cat = null;
//    ┗
//    ┏ Sammy
//    ┃ Cat cat1 = new Cat("Sammy");
//    ┃┏ Maisy
//    ┃┃Cat cat2 = new Cat("Maisy");
//    ┃┃cat2 = cat1;
//    ┃┗
//    ┃┏ Ginger
//    ┃┃cat1 = new Cat("Ginger");
//    ┃┃ cat2 = null;
//    ┃┗
//    ┗
//    }
//    — Объект «кот Томми» существует всего одну строчку с момента создания. Уже на следующей строке единственную переменную, которая хранит на него ссылку, «обнуляют» и объект уничтожается Java-машиной.
//
//— Объект «кот Семми» после создания хранится в переменной cat1. Или, если быть точным, там хранится ссылка на него. Парой строчек ниже эта ссылка копируется в cat2. После этого в cat1 сохраняется ссылка на другой объект, и ссылка на «кот Семми» остаётся только в cat2. Наконец, в последней строке метода main, последнюю ссылку на объект обнуляют.
//
//— Объект «кот Мейси» существует сразу после создания всего одну строчку. На следующей строке переменной cat2 присваивают другое значение, и ссылка на «кот Мейси» теряется. Объект становится недостижимым и считается мусором (объект умер).
//
//        — Объект «кот Джинджер» существует сразу после создания и до конца метода. Вместе с окончанием метода будет уничтожена переменная cat2, и следом за ней и объект «кот Джинджер».

    public static class Cat {
        String name;
        public Cat(String name) {
            this.name = name;
        }
        public String Cat(){
            return name;
        }
    };

    public static void main(String[] args) throws Exception {

    // Tommy
    Cat cat = new Cat("Tommy");
        System.out.println(cat.Cat());
    cat =null;
        System.out.println(cat == null?"пусто":cat.Cat());
    //Sammy
    Cat cat1 = new Cat("Sammy");
        System.out.println(cat1.Cat());
    //Maisy
    Cat cat2 = new Cat("Maisy");
        System.out.println(cat2.Cat());
    cat2 =cat1;
        System.out.println(cat1.Cat());
        System.out.println(cat2.Cat());
    //Ginger
    cat1 =new Cat("Ginger");
        System.out.println(cat1.Cat());
        System.out.println(cat2.Cat());
    cat2 =null;
        System.out.println(cat == null?"пусто":cat.Cat());
        System.out.println(cat1 == null?"пусто":cat1.Cat());
        System.out.println(cat2 == null?"пусто":cat2.Cat());

        System.gc();
        Runtime.getRuntime().gc();
}
}