public class Square extends Shape {

   private float side;

   public Square(int id, float xCoordinate, float yCoordinate, float side) {
      super(id, xCoordinate, yCoordinate);
   }

   public void setSide(int side) {
      this.side = side;
   }

   @Override
   public double getArea() {
      return side * side;
   }

   @Override
   public double getPerimeter() {
      return side * 4;
   }

   public float getSide() {
      return side;
   }
}
