package entities;

public class ContaBancaria {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public static double TAXA = 5.00;
	
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		 saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor - TAXA;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double depositoInicial) {
		this.saldo = depositoInicial;
	}

	@Override
	public String toString() {
		return "Conta " + " " + numeroConta + ", " + "Titular: " + titular + ", Saldo: $ " + String.format("%.2f", saldo);
				 
	}
	

}
