package br.banco.testes.com;

import br.banco.com.Cliente;
import br.banco.com.Conta;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente titular = new Cliente();
		Conta minhaConta = new Conta(titular);
		Cliente c = new Cliente();
		minhaConta.setTitular(c);

	}

}
