package Group_lecture;

import java.util.ArrayList;
/**
 * Created by Kgrebenyuk on 28.12.2018.
 */
/*
* Абстракция — один из четырех основных принципов объектно-ориентированного программирования.
* Она означает выделение главных, наиболее значимых характеристик предмета, и наоборот — отбрасывание второстепенных, незначительных.
* 1) instance (Объект) сущность обладающая набором характеристик свойственных конкретному экземпляру класса. Имеет конкретные значения полей
* (низший уровень, без абстракции)

2) class (класс) описание множества объектов схожих по свойствам и внутренней структуре (шаблон для создания объектов).

3) abstract class (Абстрактный класс) - абстрактное описание характеристик множества классов (выступает как шаблон для наследования другими классами).
Имеет высокий уровень абстракции, в связи с чем, от абстрактного класса нельзя создавать объекты напрямую* (только через создание объектов от классов наследников)

Внутри абстрактного класса могут присутствовать методы с реализацией (но не обязательно)

4) interface (Интерфейс) - это конструкция языка программирования Java, в рамках которой могут описываться только абстрактные публичные методы (abstract public)
и статические константы свойства (final static). То есть также, как и на основе абстрактных классов, на основе интерфейсов нельзя порождать объекты.

upd: Начиная с Java 8 кроме абстрактных методов и констант мы также можем использовать в интерфейсах стандартные методы (default methods) и статические методы
(static methods).
* */
public class Abstraction {

    public interface Animal {
        public abstract String makeSound();
    }

    public static class Cow implements Animal {
        public String makeSound() {
            return "Moo Moo!";
        }
    }

    public static class Dog implements Animal {
        public String makeSound() {
            return "Ruff Ruff!";
        }
    }

    public static class Sheep implements Animal {
        public String makeSound() {
            return "Baa Baa!";
        }
    }

    // this class demonstrates the polymorphic behavior


        public static void main(String[] args) {
            ArrayList<Animal> animals = new ArrayList<Animal>();
            animals.add(new Cow());
            animals.add(new Sheep());
            animals.add(new Dog());

            for (Animal animal : animals) {
                // this is where the polymorphisim occurs
                // each animal will make a different sound
                // because the makeSound method is getting
                // bound to different blocks of code based
                // on the exact type of animal class hiding
                // under the Animal abstraction.
                System.out.println(animal.makeSound());
            }
        }

}
