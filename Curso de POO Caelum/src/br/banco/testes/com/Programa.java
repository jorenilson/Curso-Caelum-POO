package br.banco.testes.com;

import br.banco.com.Conta;

public class Programa {

	public static void main(String[] args) {

		Conta minhaConta;
		minhaConta = new Conta();

		minhaConta.setDono("Duke");
		minhaConta.setSaldo(1000.0);

		System.out.println("Saldo atual: " + minhaConta.getSaldo());
	}

}
