package level05.lecture04;

/**
 * Created by KGrebenyuk on 17.01.2019.
 */
public class lecture04 {

static class Cat {
    public String name;

//    Метод getName – это getter (произносится гЭттэр),
//    т.е. он возвращает значение переменной-класса name. Имя метода строится по принципу get + «имя переменной с большой буквы».
    public  String getName() {
        return name;
    }

//    Метод setName – это setter (произносится сЭттэр), т.е. он используется для присваивания нового значения переменной-класса name.
//    Имя метода строится по принципу set + «имя переменной с большой буквы».
//    В этом методе имя параметра совпадает с именем переменной класса, поэтому мы ставим this перед именем переменной.
    public void setName(String name) {
        this.name = name;
    }
}

    public static void main(String[] args)
    {
        Cat vaska = new Cat();

        vaska.setName("Krasivchik");
        System.out.println(vaska.getName());


    }

}