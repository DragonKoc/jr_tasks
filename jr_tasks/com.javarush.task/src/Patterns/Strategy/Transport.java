package Patterns.Strategy;

public class Transport {

    Moving  moving;

    public Transport(){
    }

        public void move(){

            moving.moving_method();

        }

    public void setMoving(Moving go) {
        moving = go;
    }
}
