import java.util.ArrayList;
public class ShapeList {
    private ArrayList <Shape> shapes;

    public ShapeList(){
        shapes=new ArrayList<>();
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    
}