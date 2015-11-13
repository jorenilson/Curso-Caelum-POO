package br.banco.com;

public class Cliente {

	private String nome;
	private String endereco;
	private String cpf;
	private int idade;

	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void mudaCpf(String cpf){
		if (this.idade <=60){
			validaCpf(cpf);
		}else{
			this.cpf = cpf;
		}
	}
	public void validaCpf(String cpf){
		// Série de regras aqui, falha caso não seja valido
	}
	
}
