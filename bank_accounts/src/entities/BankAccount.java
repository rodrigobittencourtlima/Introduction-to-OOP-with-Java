package entities;

public class BankAccount {

	private String number;
	private String holder;
	private double balance;

	public BankAccount(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public BankAccount(String number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double depositValue) {
		balance += depositValue;
	}

	public void withdraw(double withdrawValue) {
		balance -= (withdrawValue + 5.00);
	}

	@Override
	public String toString() {
		return "Account " + this.number + ", Holder: " + this.holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
