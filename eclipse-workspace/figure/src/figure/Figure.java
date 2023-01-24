package figure;

public abstract class Figure {
      float dim1, dim2;

      public Figure(float dim1, float dim2) {
            this.dim1 = dim1;
            this.dim2 = dim2;
      }
      
      public abstract float area();      
}