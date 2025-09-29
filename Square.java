public class Square extends Shape {

   private float side;

   public Square(int id, float xCoordinate, float yCoordinate, float side) {
      super(id, xCoordinate, yCoordinate);
      this.side = side;
   }

   public void setSide(int side) {
      this.side = side;
   }

   public float getSide() {
      return side;
   }

   @Override
   public double getArea() {
      return side * side;
   }

   @Override
   public double getPerimeter() {
      return side * 4;
   }

   @Override
   public String getDimensions() {
      return "lado: " + side;
   }

   @Override
   public String getShapeType(){
      return "Cuadrado";
   }
}