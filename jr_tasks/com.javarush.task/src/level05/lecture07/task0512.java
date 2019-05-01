package level05.lecture07;

/**
 * Created by Kgrebenyuk on 25.01.2019.
 */
public class task0512 {

/*
Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.
*/

public static class Circle {
   private int centerX, centerY, radius, width, color;

   public void initialize(int centerX, int centerY, int radius){
       this.centerX = centerX;
       this.centerY = centerY;
       this.radius = radius;
   }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}

}