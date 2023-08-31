package homework2;

public class Main {
    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal mammal = new Mammal();
        Animal raptile = new Raptile();

        Zookeeper GIGI = new ImplementationZOO();
        GIGI.feed(bird);
        GIGI.feed(mammal);
        GIGI.feed(raptile);


    }
}
