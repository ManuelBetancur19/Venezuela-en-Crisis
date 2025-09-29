public class Triangle extends Rectangle {

    private float base;

    public Triangle(int id, float xCoordinate, float yCoordinate, float side, float weight, float base) {
        super(id, xCoordinate, yCoordinate, side, weight);
        this.base = base;
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

    @Override
    public String getDimensions() {
        return "lado 1: " + getSide() + ", lado 2: " + getHeight() + ", lado 3: " + base;
    }

    @Override
    public String getShapeType(){
        return "Triangulo";
    }
}
