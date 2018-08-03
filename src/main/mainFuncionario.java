package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class mainFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.SalarioBruto = sc.nextDouble();
		System.out.print("Taxa de Imposto: ");
		funcionario.taxa = sc.nextDouble();
		System.out.println();
		System.out.println(funcionario);
		System.out.print("Em quantos porcento você vai aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		funcionario.AumentaSalario(porcentagem);
		System.out.println();
		System.out.println("Atualizando dados: " + funcionario.getNome() + ", $" + String.format("%.2f%n", funcionario.SalarioBruto));

		sc.close();

	}
}