package figure;

public class Rectangle extends Figure{
      public Rectangle(float l, float b) {
            super(l, b);
      }      

      @Override
      public float area() {
            return dim1 * dim2;
      }            
}
