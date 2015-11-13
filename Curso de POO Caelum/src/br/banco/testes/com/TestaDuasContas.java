package br.banco.testes.com;

import br.banco.com.Conta;

public class TestaDuasContas {

	public static void main(String[] args) {

		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.setSaldo(1000);
		
		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.setSaldo(15000);
	}

}
