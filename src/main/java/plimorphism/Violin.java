package plimorphism;

public class Violin implements Instrument{

    @Override
    public void playSound() {
        System.out.println("play violion");
    }

    public void breakCord(){
        System.out.println("poing ... the violion break a cord");
    }
}
