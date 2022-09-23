import java.util.Scanner;

public class MAIN {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter name:");
		String name=in.nextLine();
		System.out.println("Enter Account No:");
		int acno=in.nextInt();
		System.out.println("Enter Balance:");
		float bal=in.nextFloat();
		bank account=new bank(name,acno,bal);
		while(true) {
			System.out.println("Enter choice:\n1.Deposit\n2.Withdraw\n3.Display\n4.exit");
			int ch=in.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter amount:");
				float amnt=in.nextFloat();
				account.deposit(amnt);
				break;
			}
			case 2:{
				System.out.println("Enter amount:");
				float amnt=in.nextFloat();
				account.withdraw(amnt);
				break;
			}
			case 3:{
				account.display();
				break;
			}
			case 4:{
				return;
			}
			}
		}
	}

}
