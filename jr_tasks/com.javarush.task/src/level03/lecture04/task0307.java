package level03.lecture04;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */

/*
Привет StarCraft!
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.

Требования:
•	Нельзя изменять классы Zerg, Protoss и Terran.
•	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
•	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
•	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя
*/

public class task0307 {
    public static void main(String[] args) {
      Zerg zerg1 = new Zerg();
      Zerg zerg2 = new Zerg();
      Zerg zerg3 = new Zerg();
      Zerg zerg4 = new Zerg();
      Zerg zerg5 = new Zerg();

      zerg1.name = "zerg1";
      zerg2.name = "zerg2";
      zerg3.name = "zerg3";
      zerg4.name = "zerg4";
      zerg5.name = "zerg5";

      Protoss protoss1 = new Protoss();
      Protoss protoss2 = new Protoss();
      Protoss protoss3 = new Protoss();

      protoss1.name = "protos1";
      protoss2.name = "protos2";
      protoss3.name = "protos3";

      Terran terran1 = new Terran();
      Terran terran2 = new Terran();
      Terran terran3 = new Terran();
      Terran terran4 = new Terran();

      terran1.name = "terran1";
      terran2.name = "terran2";
      terran3.name = "terran3";
      terran4.name = "terran4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
