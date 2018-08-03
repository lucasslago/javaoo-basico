package entities;

public class Employee {
	
	private int id;
	private String nome;
	private double salario;
	
	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public double getSalario() {
		return salario;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void aumentaSalario(double porcentagem) {
		salario += salario * (porcentagem/100);
	}
	
	
	public String toString(){
		return id + ", " + nome + ", " + String.format("%.2f%n", salario);
	}
	
	
}
