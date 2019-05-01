package Group_lecture;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class Constructors_base {

    public static class Animal {

        String name;
        int age = 0;
        String tail;
        String brain;
        String heart;

        public Animal(String brain, String heart) {
            this.brain = brain;
            this.heart = heart;
        }
    }


    public static class Cat extends Animal {
     /*   public Cat() {
            System.out.println("Отработал конструктор Cat!");
        }

        public Cat(String brain, String heart, String tail) {
            this.brain = brain;
            this.heart = heart;
            this.tail = tail;
        }

        public Cat(Animal animal){
            System.out.println("Отработал конструктор Cat SUPER!");
        }*/

        String color;

//Достаточно вызвать конструктор родительского класса и передать ему нужные параметры:

        public Cat(String brain, String heart, String tail) {
            super(brain, heart);
            this.tail = tail;
        }

    }

    public static class Dog extends Animal {
        public Dog(String brain, String heart, String tail) {
            super(brain, heart);
            this.tail = tail;
        }
    }

    public static class AnimalCreate {

        String brain = "Изначальное значение brain в классе Animal";
        String heart = "Изначальное значение heart в классе Animal";

        public int animalCount = 7700000;

        public  AnimalCreate(String brain, String heart) {
            System.out.println("Выполняется конструктор базового класса Animal");
            System.out.println("Были ли уже проинициализированы переменные класса Animal?");
            System.out.println("Текущее значение статической переменной animalCount = " + animalCount);
            System.out.println("Текущее значение brain в классе Animal = " + this.brain);
            System.out.println("Текущее значение heart в классе Animal = " + this.heart);
            System.out.println("Были ли уже проинициализированы переменные класса Cat?");
            System.out.println("Текущее значение статической переменной catsCount = " + CatCreate.catsCount);

            this.brain = brain;
            this.heart = heart;
            System.out.println("Конструктор базового класса Animal завершил работу!");
            System.out.println("Текущее значение brain = " + this.brain);
            System.out.println("Текущее значение heart = " + this.heart);
        }


        public static class CatCreate extends AnimalCreate {

            String tail = "Изначальное значение tail в классе Cat";

            static int catsCount = 37;

            public CatCreate(String brain, String heart, String tail) {
                super(brain, heart);
                System.out.println("Конструктор класса Cat начал работу (конструктор Animal уже был выполнен)");
                System.out.println("Текущее значение статической переменной catsCount = " + catsCount);
                System.out.println("Текущее значение tail = " + this.tail);
                this.tail = tail;
                System.out.println("Текущее значение tail = " + this.tail);
            }
        }

        public static void main(String[] args) {

            //       Cat cat = new Cat();//Отработал конструктор Cat!
            Cat catname = new Cat("Мозг", "Сердце", "Хвост");
            System.out.println(catname.brain);
            //SUPER
            //       Cat catsuper = new Cat();
            //     System.out.println(catsuper.age);

            Dog dog = new Dog("Мозг", "Сердце", "Хвост");
            dog.name = "Vaska";
            System.out.println(dog.name);

            System.out.println("*******************************");

            CatCreate catcreate = new CatCreate("Мозг", "Сердце", "Хвост");

        }
    }
}
