package br.carro.testes.com;

import br.com.curso.carro.Carro;

public class TestaCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.setCor("Verde");
		meuCarro.setModelo("Fusca");
		meuCarro.setVelocidadeAtual(0);
		meuCarro.setVelocidadeMaxima(80);
		
		// liga o carro
		meuCarro.liga();
		
		// acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.getVelocidadeAtual());
	}

}
