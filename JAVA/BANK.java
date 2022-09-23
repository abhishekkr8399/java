
public class BANK {
	String name;
	int accno;
	float balance;
	
	bank(String Ename,int Eacno,float Ebal){
		name=Ename;
		accno=Eacno;
		balance=Ebal;
	}
	void deposit(float amnt) {
		balance=balance+amnt;
		System.out.println("successfully deposited");
	}
	void withdraw(float amnt) {
		if(balance-amnt>=1000) {
			balance=balance-amnt;
			System.out.println("successfull transaction");
		}
		else {
			System.out.println("balance has reached minimum");
			System.out.println("transaction failed");
		}
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Account no.:"+accno);
		System.out.println("Balance:"+balance);
	}

}
