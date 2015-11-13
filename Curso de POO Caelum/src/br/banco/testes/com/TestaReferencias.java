package br.banco.testes.com;

import br.banco.com.Conta;

public class TestaReferencias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1; // linha importante
		c2.deposita(200);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());		
	}

}
