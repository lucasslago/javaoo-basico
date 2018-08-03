package main;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class mainBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Informe o seu nome: ");
		String titular = sc.next();
		System.out.print("Há um depósito inicial a ser feito (s/n)? ");
		String opcao = sc.next();
		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titular, 0);
		if (opcao.equals("s")) {
			System.out.print("Insira o o valor do depósito inicial: ");
			double saldo = sc.nextDouble();
			contaBancaria.setSaldo(saldo);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Insira um valor de depósito: ");
		double valor = sc.nextDouble();
		contaBancaria.depositar(valor);
		
		System.out.println();
		System.out.println("Dados atualizados da conta:");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Insira um valor de saque: ");
		double valor2 = sc.nextDouble();
		contaBancaria.sacar(valor2);
		
		System.out.println();
		System.out.println("Dados atualizados da conta:");
		System.out.println(contaBancaria);
		
		sc.close();
	}

}
