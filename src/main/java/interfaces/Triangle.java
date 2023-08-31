package interfaces;

public class Triangle extends Shape {
    @Override
    public void rollAround(){
        System.out.println("Rolls very slowly");

    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    void draw() {

    }
}
