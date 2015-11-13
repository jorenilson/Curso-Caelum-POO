package br.banco.testes.com;

import br.banco.com.Cliente;
import br.banco.com.Conta;

public class TestaEstouro2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente titular = new Cliente();
		Conta minhaConta = new Conta(titular);
		//minhaConta.limite = 100;
		//minhaConta.saldo = -200; Saldo está a baixo dos 100 de limite
	}

}
