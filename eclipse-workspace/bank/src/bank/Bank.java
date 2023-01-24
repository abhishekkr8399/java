/*
Write java program to design a class called Bank Account. Include following data 
members like name of the depositor, account number and balance. Initialize the 
data members using constructor (read the input from keyboard). Use following methods.
a) Deposit an amount b) to withdraw an amount c) to display name and balance.
 */
package bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Account b = null;
        while (true) {
            System.out.print("\n1. Create Account"
                    + "\n2. Deposit Amount"
                    + "\n3. Withdraw Amount"
                    + "\n4. Display account details"
                    + "\n5. Exit"
                    + "\nEnter your choice: ");

			int choice = new Scanner(System.in).nextInt();

            if (b == null && choice > 1 && choice < 5) {
                System.out.println("Please create an account first from main menu.");
                continue;
            }
			Scanner ip = new Scanner(System.in);
            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accno = ip.nextInt();
                    ip.nextLine();
                    System.out.print("Enter customer name: ");
                    String name = ip.nextLine();
                    System.out.print("Enter initial balance: ");
                    float balance = ip.nextFloat();

                    b = new Account(accno, name, balance);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    float amount = ip.nextFloat();
                    b.deposit(amount);
                    System.out.println("Amount Rs. " + amount + " credited. Current balance is Rs. " + b.getBalance());
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    amount = ip.nextFloat();
                    if (b.withdraw(amount)) 
                        System.out.println("Amount Rs. " + amount + " debited. Current balance is Rs. " + b.getBalance());
                    break;
                case 4:
                    System.out.println(b);
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}
