package interfaces;

public abstract class Shape {
    int sides;

//	Shape(int sides) {
//		this.sides = sides;
//	}

    public abstract void rollAround();

    abstract double getArea();
    abstract void draw();
}