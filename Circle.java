public class Circle extends Shape{

    private double radio;

    public Circle (int id, float x, float y){
        super(id, x, y);
    }

    public void setRadio(float radio){
        this.radio=radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double getArea(){
        return(Math.PI*(radio*radio));
    }

    @Override
    public double getPerimeter(){
        return(2*Math.PI*getRadio());
    }

}
