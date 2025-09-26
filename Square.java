public class Square extends Shape{

   private float side;
   
   public Square(int id, float x, float y){
    super(id,x,y);
   }

   public void setSide (int side){
    this.side = side;
   }

   @Override
   public float getArea(){
    return side*side;
   }
   @Override
   public float getPerimeter(){
    return side * 4;
   }
    
}
