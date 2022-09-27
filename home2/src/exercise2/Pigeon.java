package exercise2;

public class Pigeon extends Animal implements Flyable {

    public Pigeon(int x, int y, int age) {
        super(x, y, age);
    }


    @Override
    public void fly(int yDistance) {
        setY(getY() + yDistance);
    }

    @Override
    public void flyMove(int xDistance, int yDistance) {
        move(xDistance);
        fly(yDistance);
    }
}
