package homework;

public class MovableCircle extends MovablePoint implements Movable{


    private int raza ;

    public int getRaza() {
        return raza;
    }

    public MovablePoint getCentru() {
        return centru;
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int raza) {
        super(x,y,xSpeed,ySpeed);
        this.raza = raza;
        centru = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    private MovablePoint centru; // obiect creat din clasa MovablePoint




    @Override
    public void moveUp() {
        centru.y += centru.ySpeed;

    }

    @Override
    public void moveDown() {
        centru.y -= centru.ySpeed;

    }

    @Override
    public void moveLeft() {
        centru.x += centru.xSpeed;

    }

    @Override
    public void moveRight() {
        centru.x -= centru.xSpeed;

    }
}
