package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount;

		System.out.print("Enter account number: ");
		String accountNumber = sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolder, initialDepositValue);
		} else {
			bankAccount = new BankAccount(accountNumber, accountHolder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bankAccount.deposit(depositValue);

		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankAccount.withdraw(withdrawValue);

		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		System.out.println();

		sc.close();
	}

}
