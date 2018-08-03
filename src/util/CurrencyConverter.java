package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double conversor(double n1, double n2) {
		return n1 * n2 + (n1 * n2 * IOF);
	}

}
