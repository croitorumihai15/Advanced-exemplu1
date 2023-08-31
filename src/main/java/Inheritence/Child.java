package Inheritence;

public class Child extends Parent{


    public Child(String hairColor, String eyeColor){
        super(hairColor, eyeColor);

    }


    void playFootball(){
        int heightOfGrandpa = getHeight();

        System.out.println("child is playing football");
    }
}
