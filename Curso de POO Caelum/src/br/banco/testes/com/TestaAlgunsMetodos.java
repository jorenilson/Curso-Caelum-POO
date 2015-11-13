package br.banco.testes.com;

import br.banco.com.Cliente;
import br.banco.com.Conta;

// Código a seguir saca dinheiro e depois deposita outra quantia na nossa Conta
public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		// criando conta
		Conta minhaConta;
		Cliente titular;
		titular = new Cliente();
		
		minhaConta = new Conta(titular);
		
		// Alterando os valores da minhaConta
		//minhaConta.setDono("Duke");
		minhaConta.setSaldo(1000);
		
		// Saca 200 reais
		minhaConta.saca(200);
		
		
		
		// deposita 500 reais
		minhaConta.deposita(500);
		System.out.println(minhaConta.getSaldo());
		
		

		
	}

}
