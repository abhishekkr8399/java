/*
    Write a Java Program to implement the Comparator using TreeSet class of Java respectively and 
    perform sorting operations on employee name and salary. 
 */
package sorting;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        TreeSet<Employee> tsName = new TreeSet<>((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        
        TreeSet<Employee> tsSalary = new TreeSet<>((o1, o2) -> {
            return Double.compare(o1.getSalary(), o2.getSalary());
        });

//        TreeSet<Employee> tsName = new TreeSet<>(new Comparator<Employee>(){
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        TreeSet<Employee> tsSalary = new TreeSet<>(new Comparator<Employee>(){
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Double.compare(o1.getSalary(), o2.getSalary());
//            }
//        });

        System.out.println("Enter number of employees: ");
        int n = in.nextInt();
        
        System.out.println("Enter " + n + " employee details:");
        for (int i = 1; i <= n; i++) {
            in.nextLine();    //skip newline character from terminal
            System.out.print("Emp-" + i + ":\nName: ");
            String name = in.nextLine();
            System.out.print("Salary: ");
            double salary = in.nextDouble();
            
            Employee emp = new Employee(name, salary);
            
            tsName.add(emp);
            tsSalary.add(emp);
        }

        System.out.println("\nEmployee details sorted by name:");
        for (Employee t : tsName) 
            System.out.println(t);

        System.out.println("\nEmployee details sorted by salary:");
        for (Employee t : tsSalary) 
            System.out.println(t);
        in.close();
    }
}
