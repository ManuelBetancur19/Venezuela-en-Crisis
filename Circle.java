public class Circle extends Shape {

    private double radio;

    public Circle(int id, float xCoordinate, float yCoordinate, double radio) {
        super(id, xCoordinate, yCoordinate);
        this.radio = radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return (Math.PI * (radio * radio));
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * getRadio());
    }

    @Override
    public String getDimensions() {
        return "radio " + radio;
    }

    @Override
    public String getShapeType() {
        return "Circulo";
    }

}
