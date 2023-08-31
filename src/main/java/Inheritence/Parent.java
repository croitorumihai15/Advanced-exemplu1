package Inheritence;

public class Parent extends GrandParent{

    protected String eyeColor;
    protected String hairColor;



    public Parent(String hairColor, String eyeColor){
        this.eyeColor=eyeColor;
        this.hairColor=hairColor;
    }

    void read(){
        System.out.println("reading newspaper");

    }


}
