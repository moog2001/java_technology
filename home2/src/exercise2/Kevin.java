package exercise2;

public class Kevin extends Human implements Programmer, Swimable {
    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void doProgramming() {
        System.out.println("Kevin is Programming...");
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
