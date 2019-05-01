package Group_lecture;
import java.util.Scanner;
/**
 * Created by Kgrebenyuk on 04.01.2019.
 */
/*
* Каждый раз наш сканер будет делать один шаг вперед и считывать следующую строку.
*
* */
public class ScannerClass {

    public static void main(String[] args) {

     /*   Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
        sc.close();

   /*     Scanner scan = new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

       // scan.useDelimiter("\n /*/ /**//*");

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        scan.close();
*/
    }

}
