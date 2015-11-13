package br.banco.com;

public class Conta {

	private int numero = 1234;
	private String dono = "Duke";
	private String cpf = "123.456.789-10";
	private double saldo;
	private double limite;
	private Cliente titular; // quando chamarem um new,
												// haverá um new Cliente para
												// ele.
	
	public Conta(Cliente titular){
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	// Métodos
	public boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	public boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == true) {
			// não deu para sacar
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public double pegaSaldo() {
		return this.saldo;
	}
}
