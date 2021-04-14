package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String accHolder = sc.nextLine();
		System.out.print("Initial balance: ");
		double accInitialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double accWithdrawLimit = sc.nextDouble();
		Account acc = new Account(accNumber, accHolder, accInitialBalance, accWithdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdrawAmount = sc.nextDouble();

		try {
			acc.withdraw(withdrawAmount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		} catch (WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
