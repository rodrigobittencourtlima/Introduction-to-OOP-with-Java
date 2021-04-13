package entities;

public class PF extends TaxPayer {

	private Double healthSpending;

	public PF() {
	}

	public PF(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double calculateTaxCollected() {
		double totalTaxCollected = 0.0;
		if (getAnnualIncome() < 20000.00) {
			totalTaxCollected += getAnnualIncome() * 0.15;
		} else {
			totalTaxCollected += getAnnualIncome() * 0.25;
		}

		if (healthSpending > 0.0) {
			totalTaxCollected -= healthSpending * 0.5;
		}

		return totalTaxCollected;
	}

	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", calculateTaxCollected());
	}

}
