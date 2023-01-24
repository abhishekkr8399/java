
/*
Create an abstract class Figure with abstract method area and two integer dimensions.   
Extend this class to inherit three more classes Rectangle, Triangle and Square which 
implements the area method. Write a java program to show how the area can be computed 
dynamically during run time for Rectangle, Square and Triangle. 
(Use constructor to initialize data members).
*/
package figure;

import java.util.Scanner;

public class FigureMain {
      public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            
            System.out.print("Enter the 2 dimensions: ");
            float x = ip.nextFloat();
            float y = ip.nextFloat();
            
            Figure f;
            
            f = new Rectangle(x, y);
            System.out.println("Area of Rectangle with length: " + x + " and breadth:" + y + " = " + f.area() + " units");
            
            f = new Triangle(x, y);
            System.out.println("Area of Triangle with base: " + x + " and height:" + y + " = " + f.area() + " units");

            f = new Square(x);
            System.out.println("Area of Square with side: " + x + " = " + f.area() + " units");
            ip.close();
      }
}
