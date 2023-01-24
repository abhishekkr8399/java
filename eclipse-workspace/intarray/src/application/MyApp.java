/*
	Design a class called Array with methods, 
a.	min(a[]) : which finds the minimum element in the array
b.	max(a[]) : which finds the minimum element in the array
c.	scale(a[], x) : Multiply the array elements by suitable scale factor
d.	average(a[]): returns average of all elements of the array.
Place Array in a package called utility. 
Develop a driver class named MyApp in package ‘application’ that reads integer elements from the user and computes smallest, largest, mean and scales the values using the Array class.


 */
package application;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = ip.nextInt();
        int a[] = new int[n];

        System.out.print("Enter " + n + " integer numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }

        System.out.print("Enter the scale value: ");
        int scale = ip.nextInt();

        System.out.println("Min value: " + utility.Array.min(a));
        System.out.println("Max value: " + utility.Array.max(a));

        utility.Array.scale(a, scale);
        System.out.println("Scaled values: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        ip.close();
    }
}

