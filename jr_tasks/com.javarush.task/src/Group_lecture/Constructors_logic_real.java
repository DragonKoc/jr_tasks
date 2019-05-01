package Group_lecture;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class Constructors_logic_real {

    public static class CarFactory {

        String name;
        int age;
        int carsCount;

        public CarFactory(String name, int age, int carsCount) {
            this.name = name;
            this.age = age;
            this.carsCount = carsCount;

        }

        public void printFactory(CarFactory carFactory){
            System.out.println("Наша автомобильная фабрика называется " + carFactory.name);
            System.out.println("Она была основана " + carFactory.age + " лет назад" );
            System.out.println("За это время на ней было произведено " + carFactory.carsCount +  " автомобилей");
            System.out.println("В среднем она производит " + (carFactory.carsCount/carFactory.age) + " машин в год");
        }



    }

    public static void main(String[] args) {

        CarFactory ford = new CarFactory("Ford", 115 , 50000000);
        CarFactory amigomotors = new CarFactory("Amigo Motors", 0 , 1000);

        ford.printFactory(ford);
        amigomotors.printFactory(amigomotors);

    }
}
