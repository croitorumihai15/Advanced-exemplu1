package point2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Point2D {
    float x;
    float y;

    Point2D() {
        x = 0;
        y = 0;

    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    List<Float> getXY() {
        //return new float[]{x,y};
        List<Float> list = new ArrayList<>();
        Collections.addAll(list,x,y);
        return list;
    }

    void setX(float x){
        this.x=x;
    }

    void setY(float y){
        this.y=y;

    }
    void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "("+ x+","+y+")";
    }

}
