/*
Design a class called Student having data members like student name and roll 
number and method called show to display the name and roll number. Derive a class 
called Test from student class having three subjects’ marks as a data members and 
method named show_marks to display the marks. Create an interface called Sports 
contains constant sports marks and method show_sportswt. Derive a class Result from 
Test class and implement the interface Sports .Calculate total marks by considering 
sports marks. Then display the total in Result class
 */
package student;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter Student Roll No.: ");
        int rollno = Integer.parseInt(ip.nextLine());
        System.out.print("Enter Student Name: ");
        String name = ip.nextLine();
        System.out.print("Enter the 3 marks: ");
        int mark1 = ip.nextInt();
        int mark2 = ip.nextInt();
        int mark3 = ip.nextInt();

        Result r = new Result(rollno, name, mark1, mark2, mark3);
        r.showStudentInfo();
        r.showMarks();
        r.showSportsMarks();
        r.showResult();
        ip.close();
    }
}
