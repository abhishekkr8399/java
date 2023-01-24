package figure;

public class Square extends Figure{
      public Square(float side) {
            super(side, side);
      }      

      @Override
      public float area() {
            return dim1 * dim2;
      }        
}
