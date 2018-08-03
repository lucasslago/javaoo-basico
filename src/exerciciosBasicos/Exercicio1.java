package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Coloque as três notas do estudante:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		double media = n1 + n2 + n3;
		if (media >= 60.00) {
			System.out.printf("Média final = %.2f%n", media);
		} else {
			System.out.printf("Média final = %.2f%n", media);
			System.out.println("FAILED");
		}
		sc.close();
	}
}
