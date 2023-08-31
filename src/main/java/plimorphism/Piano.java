package plimorphism;

public class Piano implements Instrument{
    @Override
    public void playSound() {
        System.out.println("play piano");
    }
}
