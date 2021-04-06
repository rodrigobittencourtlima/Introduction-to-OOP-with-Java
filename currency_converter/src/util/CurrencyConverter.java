package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double convertDollarToReal(double dollarPrice, double dollarsAmount) {
		return dollarPrice * dollarsAmount * (1.0 + IOF);
	}

}
