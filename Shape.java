public abstract class Shape{

    private int id;
    private float x;
    private float y;

    public Shape(int id, float x, float y){
        this.id = id;
        this.x = x;
        this.y = y;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

    public int getId(){
        return id;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
}