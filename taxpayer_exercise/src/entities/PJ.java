package entities;

public class PJ extends TaxPayer {

	private int employeesNumber;

	public PJ() {
	}

	public PJ(String name, Double annualIncome, int employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double calculateTaxCollected() {
		if (employeesNumber > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
	}

	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", calculateTaxCollected());
	}

}
