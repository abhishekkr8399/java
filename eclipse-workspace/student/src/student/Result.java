
package student;

public class Result extends Test implements Sports{
      
      public Result(int rollno, String name, int mark1, int mark2, int mark3) {
            super(name, rollno, mark1, mark2, mark3);
      }

      public float getResult() {
            return mark1 + mark2 + mark3 + SPORTSMARKS;
      }
      
      public void showResult() {
            System.out.println("Total Marks: " + getResult());
      }

      @Override
      public void showSportsMarks() {
            System.out.println("Sports Marks: " + SPORTSMARKS);
      }
}

