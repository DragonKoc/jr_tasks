package Group_lecture;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */
 public class User {
        String name;
        short age;
        int heaght;

        public User (String name, short age, int heaght){
            this.name = name;
            this.age = age;
            this.heaght = heaght;

        }
        public User (short age, String name, int heaght){
            this.age = age;
            this.name = name;
            this.heaght = heaght;

        }
        public User (int heaght, String name, short age){
            this.heaght = heaght;
            this.name = name;
            this.age = age;
        }
        public User (short age, int heaght, String name){
            this.age = age;
            this.heaght = heaght;
            this.name = name;
        }
        public User(String name, int heaght, short age) {
            this.name = name;
            this.heaght = heaght;
            this.age = age;
        }
        public User (int heaght, short age, String name){
            this.heaght = heaght;
            this.age = age;
            this.name = name;
        }

        public static void main (String []agrs ){
            User vadim = new User (192, (short)12 , " Vadim");
            System.out.println("Зовут " + vadim.name + " Возраст " +vadim.age + " Рост " + vadim.heaght);
        }
    }

