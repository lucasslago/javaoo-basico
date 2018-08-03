package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class employeeMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> funcionarios = new ArrayList<>();

		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			Employee funcionario = new Employee(id, nome, salario);
			funcionarios.add(funcionario);
		}

		System.out.println();
		System.out.print("Insira o id do funcion�rio que voc� deseja aumentar o sal�rio: ");
		int id = sc.nextInt();
		Employee emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("O id informado n�o existe!");
		} else {
			System.out.print("Insira o valor da porcentagem: ");
			double perc = sc.nextDouble();
			emp.aumentaSalario(perc);
		}

		System.out.println();
		System.out.println("Lista de funcion�rios: ");
		for (Employee x : funcionarios) {
			System.out.print(x);
		}
		sc.close();
	}
}
