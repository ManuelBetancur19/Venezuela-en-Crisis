public class Oval extends Circle {

    private double radio2;

    public Oval(int id, float xCoordinate, float yCoordinate, double radio, double radio2) {
        super(id, xCoordinate, yCoordinate, radio);
    }

    public void setRadio2(double radio2) {
        this.radio2 = radio2;
    }

    @Override
    public double getArea() {
        return Math.PI * radio2 * getRadio();
    }

    @Override
    public double getPerimeter() {
        double a = getRadio(); // semieje mayor
        double b = radio2; // semieje menor
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

}
