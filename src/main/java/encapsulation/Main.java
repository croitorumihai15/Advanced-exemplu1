package encapsulation;

public class Main {
    public static void main(String[] args) {
        HealthTracker healthTracker = new HealthTracker();
        healthTracker.setHeight(1.70);
        healthTracker.setWeight(70);
        healthTracker.setSteps(1000);


        healthTracker.display();

    }
}
