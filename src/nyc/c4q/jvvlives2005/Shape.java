package nyc.c4q.jvvlives2005;
import sun.plugin.dom.css.Rect;

/**
 * Created by c4q-joshelynvivas on 4/26/15.
 */
public abstract class Shape
{
    int num_sides;
    public abstract int area();
    public void name(){
        System.out.println("I'm a shape.");
    }
}
class Rectangle extends Shape {
    Rectangle(){
        num_sides = 4;
    }
    int length;
    int width;
    public int area(){
        return length * width;
    }
}

class Square extends Rectangle {
    @Override
    public void name(){
        System.out.println("I'm a square.");
    }
}
