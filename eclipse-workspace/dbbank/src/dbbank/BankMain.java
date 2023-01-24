package dbbank;
import java.sql.SQLException;
import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Account.connectToDB();
        Scanner numIp = new Scanner(System.in);
        Scanner strIp = new Scanner(System.in);
        while(true) {
            try{
                System.out.print("1.Insert 2.Delete 3.Update 4.Display 5.Exit\nEnter your choice...");
                switch(numIp.nextInt()){
                    case 1:
                        System.out.println("enter account no.: ");
                        int accno = numIp.nextInt();
                        System.out.println("enter customer name.: ");
                        String name = strIp.nextLine();
                        System.out.println("enter account balance: ");
                        float balance = numIp.nextFloat();
                        boolean x=Account.insert(accno, name, balance);
                        System.out.println(x ?"successfully inserted" : " Insertion failed");
                        break;
                    case 2:
                        System.out.println("enter account no to delete: ");
                        accno = numIp.nextInt();
                        x=Account.delete(accno);
                        System.out.println(x ?"successfully deleted" : " Deletion failed");
                        break;
                    case 3:
                        System.out.println("enter account no to update: ");
                        accno = numIp.nextInt();
                        System.out.println("enter customer's new name: ");
                        name = strIp.nextLine();
                        x=Account.update(accno,name);
                        System.out.println(x ?"successfully updated" : " updation failed");
                        break;
                    case 4:
                        Account.display();
                        break;
                    case 5:
                        Account.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }catch(SQLException ex){
                System.err.println(ex);
            }
            //numIp.close();
            //strIp.close();
        }
    }
}

