public class Oval extends Circle{
    private double radio2;

    public Oval (int id, float x,float y,double radio){
        super(id, x, y, radio);
    }

    @Override
    public double getArea(){
        return Math.PI*radio2*getRadio();
    }

    @Override
    public double getPerimeter() {
    double a = getRadio();   // semieje mayor
    double b = radio2;       // semieje menor

    return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

}
 