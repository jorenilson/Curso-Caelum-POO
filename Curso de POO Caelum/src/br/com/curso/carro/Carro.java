package br.com.curso.carro;

public class Carro {

	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private Motor motor;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	// liga o carro
	public void liga(){
		System.out.println("O carro está ligado");
	}
	
	// acelera uma certa quantidade
	public void acelera(double quantidade){
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	// devolve a marcha do carro
	public int pegaMarcha(){
		if (this.velocidadeAtual < 0){
			return -1;
		}
		if(this.velocidadeAtual >=0 && this.velocidadeAtual < 40){
			return 1;
		}
		if (this.velocidadeAtual >=0 && this.velocidadeAtual < 80){
			return 2;
		}
		return 3;
	}
}
