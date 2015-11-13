package br.banco.com;

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	private Cliente titular; // quando chamarem um new,
												// haver� um new Cliente para
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

	// M�todos
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
			// n�o deu para sacar
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
