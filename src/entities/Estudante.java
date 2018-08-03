package entities;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNota(){
		return nota1 + nota2 + nota3;
	}
	public double naoPassou() {
		return 60 - somaNota();
	}
}
