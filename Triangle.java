public class Triangle extends Rectangle {

    private float base;

    public Triangle(int id, float xCoordinate, float yCoordinate, float side, float weight, float base) {
        super(id, xCoordinate, yCoordinate, side, weight);
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        double a = (getSide() + getHeight() + base) / 2;
        return Math.sqrt(a * (a - getSide()) * (a - getHeight()) * (a - base));
    }

    @Override
    public double getPerimeter() {
        return (getSide() + getHeight() + base);
    }
}
