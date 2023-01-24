/*
Design a class called Student having data members like student name and roll number and method 
called show to display the name and roll number. 
Derive a class called Test from student class having three subjects’ marks 
as a data members and method named show_marks to display the marks. 
Create an interface called Sports contains constant sports marks and method show_sportswt. 
Derive a class Result from Test class and implement the interface Sports .
Calculate total marks by considering sports marks. Then display the total in Result class.

*/
package student;

public class Student {
      private String name;
      private int rollno;

      public Student(String name, int rollno) {
            this.name = name;
            this.rollno = rollno;
      }
      
      public void showStudentInfo() {
            System.out.println("Roll No.: " + rollno + "\nName: " + name);
      }
}

