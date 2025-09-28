public class Rectangle extends Square {

    private float height;

    public Rectangle(int id, float xCoordinate, float yCoordinate, float side, float height) {
        super(id, xCoordinate, yCoordinate, side);
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return getSide() * height;
    }

    @Override
    public double getPerimeter() {
        return getSide() * 2 + height * 2;
    }

    public float getHeight() {
        return height;
    }
}