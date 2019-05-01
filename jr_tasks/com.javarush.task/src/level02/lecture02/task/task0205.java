package level02.lecture02.task;

/**
 * Created by Kgrebenyuk on 24.12.2018.
 */
public class task0205 {

    public static void main(String[] args) {
        hackSalary(700);
    }

    public static void hackSalary(int a) {
        a = a + 100;
        System.out.println("Твоя зарплата составляет: " + a + " долларов в месяц.");
    }
}
