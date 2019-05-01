package Group_lecture;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class Constructors_zachem {

  /*  public static class Car {

        String model;
        int maxSpeed;

        public static void main(String[] args) {

            Car bugatti = new Car();
            bugatti.model = "Bugatti Veyron";
            bugatti.maxSpeed = 407;

            System.out.println(bugatti.model);

        }
    }*/
 /* public static class Car {

      String model;//модель
      int maxSpeed;//максимальная скорость
      int wheels;//ширина дисков
      double engineVolume;//объем двигателя
      String color;//цвет
      int yearOfIssue;//год выпуска
      String ownerFirstName;//имя владельца
      String ownerLastName;//фамилия владельца
      long price;//цена
      boolean isNew;//новая или нет
      int placesInTheSalon;//число мест в салоне
      String salonMaterial;//материал салона
      boolean insurance;//застрахована ли
      String manufacturerCountry;//страна-производитель
      int trunkVolume;//объем багажника
      int accelerationTo100km;//разгон до 100 км/час в секундах


      public static void main(String[] args) {
          Car bugatti = new Car();

          bugatti.color = "blue";
          bugatti.accelerationTo100km = 3;
          bugatti.engineVolume = 6.3;
          bugatti.manufacturerCountry = "Italy";
          bugatti.ownerFirstName = "Amigo";
          bugatti.yearOfIssue = 2016;
          bugatti.insurance = true;
          bugatti.price = 2000000;
          bugatti.isNew = false;
          bugatti.placesInTheSalon = 2;
          bugatti.maxSpeed = 407;
          bugatti.model = "Bugatti Veyron";

          System.out.println("Модель Bugatti Veyron. Объем двигателя - " + bugatti.engineVolume + ", багажника - " + bugatti.trunkVolume +
                  ", салон сделан из " + bugatti.salonMaterial +
                  ", ширина дисков - " + bugatti.wheels + ". Была приоберетена в 2018 году господином " + bugatti.ownerLastName);


      }

  }*/

    public static class Car {

        String model;
        int maxSpeed;

      /*  public Car(String model, int maxSpeed) {
            this.model = model;
            this.maxSpeed = maxSpeed;
        }*/

    }

    public static class Cat {

        String name;
        int age;

        //для первого кота
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //для второго кота
        public Cat(String name) {
            this.name = name;
        }

        public Cat(){

        }

    }

    public static void main(String[] args) {
        Car bugatti = new Car(); //ошибка! если конструктор не обьявлен
        Cat barsik = new Cat("Barsik", 5);
        Cat streetCatNamedBob = new Cat("Bob");
        Cat noNameCat = new Cat();
    }

}
