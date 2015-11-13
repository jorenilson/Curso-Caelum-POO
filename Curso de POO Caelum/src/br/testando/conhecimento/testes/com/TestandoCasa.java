package br.testando.conhecimento.testes.com;

import br.testando.conhecimento.com.Casa;
import br.testando.conhecimento.com.Porta;

public class TestandoCasa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casa minhaCasa = new Casa();
		minhaCasa.setCor("Amarelo");

		// Criar tres portas e colocar na casa
		minhaCasa.portas = new Porta[3];
		
		for (int i = 0; i < 3; i++) {
			Porta p = new Porta();
			if (i % 2 == 0) {
				p.setAberta(true);
			} else {
				p.setAberta(false);
			}
			minhaCasa.adicionaPorta(p);
		}
		
		System.out.println("Cor da Casa: "+minhaCasa.getCor());
		System.out.println("Quantidade de portas abertas: "+minhaCasa.quantasPortasEstaoAbertas());
		System.out.println("Total de portas: "+minhaCasa.totalDePortas());
	}

}
