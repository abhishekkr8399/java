/*
Create a class as Student. Write a program in Java to display the names and roll 
numbers of students. 
Create an array of 5 students and initialize the array with 
user input. 
Handle ArrayIndexOutOfBoundsExeption, so that any such problem 
doesn’t cause illegal termination of program. 
Read a character from user and 
display the student names starting with given character.
 */
package studentarray;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Student a[] = new Student[5];

        try {
            for (int i = 0; i <= 5; i++) {
                  System.out.print("Enter rollno and name of student " + (i+1) + ": ");
                  a[i] = new Student(ip.nextInt(), ip.next());
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception: ArrayIndexOutOfBoundsException occured");
        }

        System.out.println("Student List");
        for (Student student : a) 
            System.out.println(student);

        System.out.print("Enter first character of name: ");
        char firstChar = ip.next().toLowerCase().charAt(0);

        System.out.println("List of student names starting with '"+ firstChar + "':");
        for(Student student: a)
            if (student.getName().toLowerCase().charAt(0) == firstChar)
                System.out.println(student.getName());
        ip.close();
    }      
}