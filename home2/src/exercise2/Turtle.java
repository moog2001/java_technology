package exercise2;

public class Turtle extends Animal implements  Swimable{
    public Turtle(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void swim(int yDistance) {
        setY(getY() + yDistance);
    }

    @Override
    public void swimMove(int xDistance, int yDistance) {
        move(xDistance);
        swim(yDistance);
    }
}
