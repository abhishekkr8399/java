
/*
    Write a Java Program to implement the Comparator using TreeSet class of Java respectively and
    perform sorting operations on employee name and salary.
 */

 package sorting;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\tSalary: " + salary;
    }
}
