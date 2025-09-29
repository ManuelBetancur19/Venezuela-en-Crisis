public abstract class Shape {

    private int id;
    private float xCoordinate;
    private float yCoordinate;

    public Shape(int id, float xCoordinate, float yCoordinate) {
        this.id = id;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(float xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setY(float yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getDimensions();

    public abstract String getShapeType();

    public int getId() {
        return id;
    }

    public float getX() {
        return xCoordinate;
    }

    public float getY() {
        return yCoordinate;
    }
}