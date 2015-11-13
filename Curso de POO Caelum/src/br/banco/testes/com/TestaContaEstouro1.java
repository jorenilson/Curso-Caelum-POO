package br.banco.testes.com;

import br.banco.com.Conta;

public class TestaContaEstouro1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta = new Conta();
		// minhaConta.saldo = 1000.0;
		//minhaConta.limite = 1000.0;
		minhaConta.setSaldo(1000.0);
		minhaConta.setLimite(1000.0);
		minhaConta.saca(50000); // saldo + limite é só 200!!
	}

}
