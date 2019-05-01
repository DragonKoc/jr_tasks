package Group_lecture;

/**
 * Created by Kgrebenyuk on 02.01.2019.
 */

/*
* Музей древностей.
Твоя задача — спроектировать класс Artifact.
Артефакты, которые хранятся в музее, бывают трех видов.
Первый — про которые неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — про которые известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — про которые известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).
* */
public class Artifact {

    static int count =0;
    int number;
    String culture;
    int century;

    public  Artifact(){
        count++;
        System.out.println("Неизвестный артифакты №"+ count);
    }

    public  Artifact(int number, String culture){
        this.number = 5;
        this.culture = "Ацтеки";
    }

    public  Artifact(int number, String culture, int century){
        this.number = number;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args){

        Artifact art1 = new Artifact();
        Artifact art2 = new Artifact(212121, "Ацтеки");
        Artifact art3 = new Artifact(212121, "Ацтеки", 12);

        System.out.println("Номер "+art2.number + " и Культура: " + art2.culture);
        System.out.println("Номер "+art3.number + " и Культура: " + art3.culture + " и Век:" + art3.century);
    }

}
