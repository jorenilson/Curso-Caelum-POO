package br.banco.testes.com;

import br.banco.com.Cliente;
import br.banco.com.Conta;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.setTitular(c);

	}

}
