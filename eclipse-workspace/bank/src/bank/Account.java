package bank;

public class Account {
    private int accno;
    private String name;
    private float balance;
    public static final int MIN_BALANCE = 500;

    public Account(int accno, String name, float balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public boolean withdraw(float amount) {
        if (amount <= 0) {
            System.err.println("Invalid amount entered.");
        } else if (balance - MIN_BALANCE < amount) {
            System.err.println("Sorry! Insufficient balance to withdraw.");
        } else {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String toString() {
        return "\nAccount No.:" + accno + "\nName: " + name + "\nBalance: " + balance;
    }
}
