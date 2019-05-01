package level02.lecture06;

/**
 * Created by Kgrebenyuk on 26.12.2018.
 */
/*
* Переменным a и b присваиваются только значения 5(m) и 6(n) соответственно, a и b ничего не знают про (никак не влияют на) m и n.
* */
public class lecture06
{
    //#1
   /* public static void main (String[] args)
    {
        int m = 5;
        int n = 6;

        System.out.println("M=" +m+ " N=" + n);
        swap(m, n);
        System.out.println("M=" +m+ " N=" + n);
    }

    private static void swap(int a, int b)
    {
        int c = a;
        a = b;
        b = c;
    }*/



    //#2
        public static void main (String[] args)
        {
            int m = 5;
            int n = 6;

            System.out.println("M=" +m+ " N=" + n);
            int a = m, b = n;

            int c = a;
            a = b;
            b = c;

            Persona pers = new Persona();

            System.out.println("M=" +m+ " N=" + n);
            System.out.println("a=" +a+ " b=" + b + "c="+c);
            System.out.println(pers.ReturnPersona());
        }
        
         public static class Persona {

                public  String ReturnPersona(){
                Student olga = new Student();
                olga.name = "Olga";
                olga.age = 21;

                Student vera = new Student();
                vera.name = "Veronika";
                vera.age = 15;

                System.out.println("Olga is " + olga.age);
                System.out.println("Vera is " + vera.age);

                ageSwap(olga, vera);

                System.out.println("Olga is " + olga.age);
                System.out.println("Vera is " + vera.age);

                return "ok";
            }

            public  void ageSwap(Student a,
                                        Student b) {

                int c = 0;
                System.out.println("a=" + a.age + " b=" + b.age + "c=" + c);
                c = a.age;
                a.age = b.age;
                b.age = c;
                System.out.println("a=" + a.age + " b=" + b.age + "c=" + c);
            }

             class Student {
                String name;
                int age;
            }
        }
}