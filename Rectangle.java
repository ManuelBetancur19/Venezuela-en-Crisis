public class Rectangle extends Square{

    private float height;

    public Rectangle (int id, float x, float y, float side, float height){
        super(id,x,y,side);
    }
    
    public void setHeight(float height){
        this.height = height;
    }

    @Override
    public double getArea(){
        return getSide() * height;
    }
    @Override
    public double getPerimeter(){
        return getSide() * 2 + height * 2;
    }


}