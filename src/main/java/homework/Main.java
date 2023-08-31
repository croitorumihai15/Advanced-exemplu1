package homework;

public class Main {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(2,3,10,15);
        point.moveUp();
        point.moveLeft();
        System.out.println(point.xSpeed);

        MovableCircle circle = new MovableCircle(5,6,10,20,9);
        circle.moveDown();
        System.out.println(circle.y);


    }
}
