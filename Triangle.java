public class Triangle extends Rectangle{
    
    private float base;

    public Triangle (int id, float x, float y, float side, float height){
        super (id,x,y,side,height);
    }

    public void setBase(float base){
        this.base = base;
    }

    @Override
    public double getArea(){
        float a = (getSide() + getHeight() + base)/2;
        double area = Math.sqrt(a * (a - getSide()) * (a - getHeight()) * (a - base));
        return area;
    }
    @Override
    public double getPerimeter(){
        return getSide() + getHeight() + base;
    }
}
