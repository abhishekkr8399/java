/*
Java program that creates multiple threads. Main thread generates a random integer. 
First child thread computes the square of next three the numbers and there should be 
idle time of one second between displaying of each computed number. 
Second child thread computes the cube of next three the numbers and there should be 
idle time of two seconds between displaying of each computed number.
*/
package threads;

public class MainClass {
      public static void main(String[] args) {
            int n = new java.util.Random().nextInt(20);
            
            System.out.println("Random number generated is:" + n);
            new Square(n).start();
            new Cube(n).start();
      }
}

