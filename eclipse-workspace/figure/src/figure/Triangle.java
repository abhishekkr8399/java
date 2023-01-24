package figure;

public class Triangle extends Figure{

      public Triangle(float l, float b) {
            super(l, b);
      }      

      @Override
      public float area() {
            return 0.5f * dim1 * dim2;
      }      
}
