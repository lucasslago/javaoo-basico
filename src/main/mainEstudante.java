package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class mainEstudante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();

		System.out.print("Nome: ");
		estudante.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		estudante.nota3 = sc.nextDouble();

		System.out.println("NOTA FINAL = " + String.format("%.2f", estudante.somaNota()));
		if (estudante.somaNota() >= 60.00) {
			System.out.print("PASSOU!");
		} else {
			System.out.println("NÃO PASSOU!");
			System.out.print("PRECISANDO DE " + String.format("%.2f", estudante.naoPassou()) + " PONTOS");

		}

		sc.close();

	}

}
