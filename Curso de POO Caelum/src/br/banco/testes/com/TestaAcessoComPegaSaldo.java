package br.banco.testes.com;

import br.banco.com.Cliente;
import br.banco.com.Conta;

public class TestaAcessoComPegaSaldo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente titular = new Cliente();
		Conta minhaConta = new Conta(titular);
		
		minhaConta.deposita(1000);
		System.out.println("Saldo: "+minhaConta.pegaSaldo());
	}

}
