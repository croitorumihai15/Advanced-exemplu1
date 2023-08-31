package org.example;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void printInfo(){
        System.out.println(model + " is going with a speed of " + String.valueOf(speed));
    }
    String getModel(){
        return model;
    }

    void setModel(String model){

        this.model = model;
    }

    int getSpeed(){
        return speed;
    }

    void setSpeed(int speed){
        if(speed > 0){
            this.speed = speed;
        } else  {
            System.out.println("speed value is not okay");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
