import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    
    private final ArrayList<Shape> shapes;

    public ShapeList() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapeList() {
        return shapes;
    }

    public Shape findById(int id) {
        for (Shape s : shapes) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public double getAreaShapes() {
        double all = 0;
        for (Shape s : shapes) {
            all += s.getArea();
        }
        return all;
    }

    public double getPerimeterShapes() {
        double all = 0;
        for (Shape s : shapes) {
            all += s.getPerimeter();
        }
        return all;
    }
}