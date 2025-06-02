package abstrac;

import java.util.Scanner;

abstract class BankAccount{
	
	private int accountnum;
	private double balance;
	
	public BankAccount(int accountnum, double balance) {
		this.accountnum = accountnum;
		this.balance = balance;
	}

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount{
	
	public SavingsAccount(int accountnum, double balance) {
		super(accountnum, balance);
		
	}
	@Override
	void deposit(double amount) {
		setBalance(getBalance()+ amount);
		System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
	}
	@Override
	void withdraw(double amount) {
		if(getBalance() >= amount) {
			setBalance(getBalance()-amount);
			System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
		}
		else {
			System.out.println("Insufficient funds. Withdrawal failed.");
		}
	}
}

/*public class CurrentAccount extends BankAccount{

	public CurrentAccount(int accountnum, double balance) {
		super(accountnum, balance);
		
	}
	
}
*/
public class Main {

	public static void main(String[] args) {
		// Bank
		double sbi, icici, axis;
		
		System.out.println("Deposite SBI:");
		
		Scanner input = new Scanner(System.in);
		sbi = input.nextDouble();
		
		SavingsAccount savingsaccount = new SavingsAccount(12345, sbi);
		savingsaccount.deposit(sbi);
		
		savingsaccount.withdraw(sbi);
		
		input.close();
	}

}
