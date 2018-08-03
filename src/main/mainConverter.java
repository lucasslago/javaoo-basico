package main;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class mainConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dolla price? ");
		double n1 = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double n2 = sc.nextDouble();
		
		double c = CurrencyConverter.conversor(n1, n2);
		System.out.printf("Amount to be paid in reais = %.2f", c );
		
		sc.close();

	}

}
