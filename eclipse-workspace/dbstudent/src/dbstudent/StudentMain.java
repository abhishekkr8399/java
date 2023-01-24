package dbstudent;
import java.sql.SQLException;
import java.util.Scanner;
public class StudentMain { 
    public static void main(String[] args) {
        Student.connectToDB();
        Scanner numIp = new Scanner(System.in);
        Scanner strIp = new Scanner(System.in);
        while(true) {
            try{
                System.out.print("1.Insert 2.Delete 3.Update 4.Search 5.Display 6.Exit\nEnter your choice...");
                switch(numIp.nextInt()){
                    case 1:
                        System.out.println("enter student Usn & Name: ");
                        String usn = strIp.nextLine();
                        String name = strIp.nextLine();
                        Student.insert(usn, name);
                        System.out.println("successfully inserted");
                        break;
                    case 2:
                        System.out.println("enter row no to delete: ");
                        int rowNo = numIp.nextInt();
                        boolean x=Student.delete(rowNo);
                        System.out.println(x ?"successfully deleted" : " Deletion failed");
                        break;
                    case 3:
                        System.out.println("enter row no to update: ");
                        rowNo = numIp.nextInt();
                        System.out.println("enter usn to update: ");
                        usn = strIp.nextLine();
                        System.out.println("enter name to update: ");
                        name = strIp.nextLine();
                        x=Student.update(rowNo,usn,name);
                        System.out.println(x ?"successfully updated" : " updation failed");
                        break;
                    case 4:
                        System.out.println("enter usn to search: ");
                        usn = strIp.nextLine();
                        name = Student.search(usn);
                        if(name == null)
                            System.out.println("no match found");
                        else 
                            System.out.println("USN: " +usn+"\tName: " +name);
                        break;
                    case 5:
                        Student.display();
                        break;
                    case 6:
                        Student.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }catch(SQLException ex){
                System.err.println(ex);
            }
           // numIp.close();
           // strIp.close();
        }
    }
}

