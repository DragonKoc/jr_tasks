package level05.lecture09;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class task0523 {
/*
Конструктор
Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод main изменять нельзя.
•	Программа должна вывести слово "Red" на экран.
•	Метод getDescription класса Color должен возвращать значение переменной description.
•	Метод setDescription класса Color должен устанавливать значение переменной description.
*/

    public  static class Circle {
        public Color color;

        public static void main(String[] args) {
            Circle circle = new Circle();
            circle.color.setDescription("Red");
            System.out.println(circle.color.getDescription());
        }

        public  Circle() {
            color = new Color();
        }

        public class Color {
            String description;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }

}
