package Group_lecture;

/**
 * Created by Kgrebenyuk on 03.01.2019.
 */
public class MethodExtend {

    public static class Truck {

        int length;
        int width;
        int height;

        int weight;

        public int getVolume() {
            int volume = length * width * height;
            return volume;
        }
    }

    public static class BridgeOfficer {

        int maxWeight;

        public BridgeOfficer(int normalVolume) {
            this.maxWeight = normalVolume;
        }

        public boolean checkTruck(Truck/*class*/ truck1/*var*/) {

            if (truck1.weight > maxWeight) {


                return false;
            } else {

                return true;
            }
        }
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.height = 4;
        truck.length = 10;
        truck.weight = 500;
        truck.width = 8;

        BridgeOfficer officer = new BridgeOfficer(10000);
        System.out.println(officer.checkTruck(truck));


        int x = truck.getVolume();
        System.out.println(x);
        /**************************************************************************/
        Truck first = new Truck();
        first.weight = 10000;
        Truck second = new Truck();
        second.weight = 20000;
        String say;
        BridgeOfficer officer2 = new BridgeOfficer(15000);
        System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
        boolean canFirstTruckGo = officer.checkTruck(first);
        if (canFirstTruckGo==true)
            say = "Да, конечно!";
                    else
                        say = "Nooooooo!";

        System.out.println(canFirstTruckGo + say);

        System.out.println();

        System.out.println("Грузовик номер 2! А мне можно?");
        boolean canSecondTruckGo = officer2.checkTruck(second);
        if (canSecondTruckGo==true)
            say = "Да, конечно!";
        else
            say = "Nooooooo!";
        System.out.println(canSecondTruckGo + say);
    }
}
