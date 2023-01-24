package student;

public class Test extends Student{
      protected int mark1, mark2, mark3;

      public Test(String name, int rollno, int mark1, int mark2, int mark3) {
            super(name, rollno);
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
      }
      
      public void showMarks() {
            System.out.println("Mark 1: " + mark1 + "\n" +
                               "Mark 2: " + mark2 + "\n" +
                               "Mark 3: " + mark3);
      }
}
