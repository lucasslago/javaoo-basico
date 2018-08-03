package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Inquilino;

public class mainInquilino {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Inquilino[] vect = new Inquilino[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
	
		
		for (int i=1; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto: #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Inquilino(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i=0; i< 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
			sc.close();
	}

}
