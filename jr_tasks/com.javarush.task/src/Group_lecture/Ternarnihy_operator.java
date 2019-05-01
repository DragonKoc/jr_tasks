package Group_lecture;

/**
 * Created by Kgrebenyuk on 31.01.2019.
 */
public class Ternarnihy_operator {

    public static class Man {

        private int age;

        public Man(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static void main(String[] args) {

            Man man = new Man(22);

            String securityAnswer;

            if (man.getAge() >= 18) {
                securityAnswer = "Все в порядке, проходите!";
            } else {
                securityAnswer = "Этот фильм не подходит для вашего возраста!";
            }
            System.out.println(securityAnswer);


            securityAnswer = (man.getAge() > 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

            System.out.println(securityAnswer);

           // String securityAnswer = (man.getAge() > 18 && (man.hasTicket() || man.hasCoupon()) && !man.hasChild())  ? "Проходите!" : "Вы не можете пройти!";


        }
    }

}
