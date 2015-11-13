package br.testando.conhecimento.com;

/***
 * Exercício 5.8
 * @author Jorenilson Lopes
 * @param Exercicio: 5.8 Testando conhecimento
 */
public class Casa {

	private String cor;
	private int totalDePortas;
	public Porta[] portas;
	private int contador=0;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTotalDePortas() {
		return totalDePortas;
	}

	public void setTotalDePortas(int totalDePortas) {
		this.totalDePortas = totalDePortas;
	}

	public Porta[] getPortas() {
		return portas;
	}

	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void pinta(String s){
		this.cor = s;
	}
	
	public int quantasPortasEstaoAbertas(){
		int cont=0;
		
		for (int i = 0; i < portas.length; i++) {
			if (portas[i].isAberta()==true){
				cont+=1;
			}
		}
		return cont;
	}
	
	public void adicionaPorta(Porta p){
		portas[this.contador] = p;
		this.contador++;
	}
	
	public int totalDePortas(){
		int cont=0;
		
		for (int i = 0; i < portas.length; i++) {
			cont++;
		}
		return cont;
	}
	
	
}
