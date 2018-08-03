package entities;

public class Funcionario {
	public String nome;
	public double SalarioBruto;
	public double taxa;

	public double SalarioLiquido(){
		return SalarioBruto - taxa;
	}
	public void AumentaSalario(double porcentagem) {
		this.SalarioBruto = (porcentagem * SalarioBruto / 100) + SalarioBruto - taxa;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Funcionario: " + nome + ", $" + String.format("%.2f%n", SalarioLiquido());
	}
}
