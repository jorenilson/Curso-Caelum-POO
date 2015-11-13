package br.banco.testes.com;

import br.banco.com.Cliente;
import br.banco.com.Conta;

public class TestaDuasContas {

	public static void main(String[] args) {

		Conta minhaConta;
		Cliente titular;
		titular = new Cliente();
		
		minhaConta = new Conta(titular);
		minhaConta.setSaldo(1000);
		
		Conta meuSonho;
		meuSonho = new Conta(titular);
		meuSonho.setSaldo(15000);
	}

}
