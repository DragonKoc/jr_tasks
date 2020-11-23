package Patterns.Strategy;

public class All_tranport {

    public static void main(String[] args) {

        Cars car1 = new Cars();

        Boards board1 = new Boards();

        car1.move();

        board1.move();

        car1.setMoving(new Wather());

        car1.move();
    }

}
