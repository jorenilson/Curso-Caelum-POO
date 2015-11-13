package br.banco.testes.com;

import br.banco.com.Cliente;
import br.banco.com.Conta;

public class TestaEstouro3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente titular = new Cliente();
		Conta minhaConta = new Conta(titular);
		
		minhaConta.setLimite(100);
		minhaConta.setSaldo(100);
		
		// quero mudar o valor para -200
		double novoSaldo = -200;
		
		// testa se novoSaldo ultrapassa o limite da conta
		if (novoSaldo<-minhaConta.getLimite()){
			System.out.println("Não posso mudar para esse saldo");
		}else {
			minhaConta.setSaldo(novoSaldo);
		}
	}

}
