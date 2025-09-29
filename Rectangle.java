public class Rectangle extends Square {

    private float height;

    public Rectangle(int id, float xCoordinate, float yCoordinate, float side, float height) {
        super(id, xCoordinate, yCoordinate, side);
        this.height = height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return getSide() * height;
    }

    @Override
    public double getPerimeter() {
        return getSide() * 2 + height * 2;
    }

    @Override
    public String getDimensions() {
        return "base: " + getSide() + ", altura: " + height;
    }

    @Override
    public String getShapeType(){
        return "Rectangulo";
    }

}