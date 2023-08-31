package homework2;

public class ImplementationZOO implements Zookeeper{

    @Override
    public void feed(Animal animal) {
        animal.makeSound();
        animal.eat();
    }
}
