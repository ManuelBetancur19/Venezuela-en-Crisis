public abstract class Shape{

    private int id;
    private float x;
    private float y;

    public Shape(int id, float x, float y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

}