package level02.lecture04;

/**
 * Created by Kgrebenyuk on 24.12.2018.
 */

/*
1. Переменная, объявленная в методе, существует/видна с начала объявления до конца метода.

2. Переменная, объявленная в блоке кода, существует до конца этого блока кода.

3. Переменные — аргументы метода — существуют везде внутри метода.

4. Переменные класса/объекта существуют все время жизни содержащего их объекта. Их видимость дополнительно регулируется специальными модификаторами доступа: public, private.

5. Статические переменные классов существуют все время работы программы. Их видимость также определяется модификаторами доступа.
*/
public class lecture04 {
    public static void main(String[] args){}
     /* ┏
        ┃public class Variables
        ┃┏
        ┃┃{
        ┃┃   private static String TEXT = "The end.";
        ┃┃  ┗━━━━━━━━━━━━━━┛
        ┃┃   public static void main (String[] args)
        ┃┃ ┏                         ┗━━━━━━━┛
        ┃┃ ┃ {
        ┃┃ ┃    System.out.println("Hi");
        ┃┃ ┃    String s = "Hi!";
        ┃┃ ┃  ┏┗━━━━┛
        ┃┃ ┃  ┃ System.out.println(s);
        ┃┃ ┃  ┃ if (args != NULL)
        ┃┃ ┃  ┃ {
        ┃┃ ┃  ┃    String s2 = s;
        ┃┃ ┃  ┃   ┗━━━━┛
        ┃┃ ┃  ┃  ┏
        ┃┃ ┃  ┃  ┃ System.out.println(s2);
        ┃┃ ┃  ┃  ┗
        ┃┃ ┃  ┃ }
        ┃┃ ┃  ┃ Variables variables = new Variables();
        ┃┃ ┃  ┃ System.out.println(variables.classVariables);
        ┃┃ ┃  ┃ System.out.println(TEXT);
        ┃┃ ┃  ┗
        ┃┃ ┃ }
        ┃┃ ┗
        ┃┃   public String classVariables;
        ┃┃  ┗━━━━━━━━━━━━━━━┛
        ┃┃   public Variables()
        ┃┃   {
        ┃┃      classVariables = "Class Variables test.";
        ┃┃   }
        ┃┃}
        ┃┗
        ┗*/
}

