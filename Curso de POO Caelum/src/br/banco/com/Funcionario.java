package br.banco.com;

public class Funcionario {

	// atributos
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada = new Data();
	private String rg;

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double calculaGanhoAnual(){
		return this.salario*12;
	}
	
	// construtor

	// métodos
	public void recebeAumento(double aumento) {
		this.salario +=aumento;
	}
	
	public void mostra(){
		System.out.println("nome: "+this.nome);
		System.out.println("departamento: "+this.departamento);
		System.out.println("salario: "+this.salario);
		System.out.println("rg: "+this.rg);
		System.out.println("Data de entrada: "+this.dataEntrada.dataFormatada());
		/*
		System.out.println("Dia: "+this.dataEntrada.getDia());
		System.out.println("Mes: "+this.dataEntrada.getMes());
		System.out.println("Ano: "+this.dataEntrada.getMes());
		*/
	}
}


/**
 * Exercício 5.5
 * @author Jorenilson Lopes
 * @param pagina: 71
 */
class Empresa {
	private String nome;
	private String cnpj;
	public Funcionario[] empregados;
	private int contador=0;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void adiciona(Funcionario f){
		
		this.empregados[contador]=f;
		this.contador +=1;
	}
	
	public void mostraEmpregados(){
		for (int i=0;i<this.empregados.length;i++){
			System.out.println("Funcionário na posição: "+i);
			empregados[i].mostra();			
		}
	}
	
	public boolean contem(Funcionario f){
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i].getNome() == f.getNome()){
				return true;
			}
		}
		return false;
	}
}

