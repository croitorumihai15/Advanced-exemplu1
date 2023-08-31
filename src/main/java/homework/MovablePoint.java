package homework;

public class MovablePoint implements Movable{
    int x ;
    int y ;
    int xSpeed ;
    int ySpeed ;

    //constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
        System.out.println("noua pozitie a lui y este " + y);

    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
        System.out.println("noua pozitie a lui y este " + y);

    }

    @Override
    public void moveLeft() {
        x = x + xSpeed;
        System.out.println("noua pozitie a lui x este: " + x);

    }

    @Override
    public void moveRight() {
        x = x - xSpeed;
        System.out.println("noua pozitie a lui x este: " + x);

    }

}
