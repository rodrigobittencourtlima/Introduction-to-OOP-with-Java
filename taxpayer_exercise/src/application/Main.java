package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PF;
import entities.PJ;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int taxPayersNumber = sc.nextInt();

		for (int i = 1; i <= taxPayersNumber; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char taxPayerType = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if (taxPayerType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayers.add(new PF(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				taxPayers.add(new PJ(name, annualIncome, employeesNumber));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer : taxPayers) {
			System.out.println(taxPayer);
		}

		double totalTaxes = 0.0;
		for (TaxPayer taxPayer : taxPayers) {
			totalTaxes += taxPayer.calculateTaxCollected();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

		sc.close();
	}

}
