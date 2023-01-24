
package studentarray;

public class Student {
    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No.: " + rollno + "    Name: " + name; 
    }
}
