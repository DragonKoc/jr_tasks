package Group_lecture;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class Construntors_logic_bad {

    public static class CarFactory {

        String name;
        int age;
        int carsCount;

        public CarFactory(String name, int age, int carsCount) {
            this.name = name;
            this.age = age;
            this.carsCount = carsCount;

            System.out.println("Наша автомобильная фабрика называется " + this.name);
            System.out.println("Она была основана " + this.age + " лет назад" );
            System.out.println("За это время на ней было произведено " + this.carsCount +  " автомобилей");
            System.out.println("В среднем она производит " + (this.carsCount/this.age) + " машин в год");
        }


        public static void main(String[] args) {

            CarFactory ford = new CarFactory("Amigo Motors", 0 , 1000);
        }
    }
}
