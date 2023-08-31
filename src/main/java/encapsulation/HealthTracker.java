package encapsulation;

public class HealthTracker {
    private int weight;
    private double height;
    private int steps;

    private double bmi(){
        double bmi = weight / (height*height);
        return bmi;
    }

    void display(){
        System.out.println("height : " + height + "weight : " + weight + " steps: " + steps);
        System.out.println("bmi is " + bmi());
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < 1){
            System.out.println(" incorrect ");
        } else {
            this.weight = weight;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 1){
            System.out.println(" incorrect ");
        } else {this.height = height;}


    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
