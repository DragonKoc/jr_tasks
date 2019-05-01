package level05.lecture09;

/**
 * Created by Kgrebenyuk on 28.01.2019.
 */
public class task0520 {
/*
Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)

Требования:
•	У класса Rectangle должны быть переменные top, left, width и height с типом int.
•	У класса должен быть хотя бы один конструктор.
•	У класса должно быть хотя бы два конструктора.
•	У класса должно быть хотя бы три конструктора.
•	У класса должно быть хотя бы четыре конструктора.
*/


    public static class Rectangle {
        private int top, left, width, height;

        public Rectangle(int left, int top, int width, int height) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }

        public Rectangle(int top, int left) {
            this.top = top;
            this.left = left;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int top, int left, int width) {
            this.top = 0;
            this.left = 0;
            this.width = width;
            this.height = width;
        }

        public Rectangle(Rectangle rectangle) {
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }


        public static void main(String[] args) {

        }
    }

}
