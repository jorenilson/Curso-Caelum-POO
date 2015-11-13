package br.banco.testes.com;

import br.banco.com.Data;
import br.banco.com.Funcionario;

public class TestaFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f1 = new Funcionario();
		
		f1.setNome("Hugo");
		f1.setDepartamento("Informática");
		f1.setSalario(100);
		f1.setRg("1697573-1");
		Data dataEntrada = new Data();
		dataEntrada.setDia(01);
		dataEntrada.setMes(07);
		dataEntrada.setAno(2010);
		f1.setDataEntrada(dataEntrada);
		f1.recebeAumento(50);
		
		/*
		System.out.println("salario atual: "+f1.getSalario());
		System.out.println("ganho anual "+f1.calculaGanhoAnual());
		*/
		f1.mostra();
	}

}
