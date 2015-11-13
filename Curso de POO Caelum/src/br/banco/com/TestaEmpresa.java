package br.banco.com;

public class TestaEmpresa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];

		/*
		 * Funcionario f1 = new Funcionario(); f1.setSalario(1000);
		 * empresa.adiciona(f1);
		 * 
		 * Funcionario f2 = new Funcionario(); f2.setSalario(1700);
		 * empresa.adiciona(f2);
		 */

		for (int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.setSalario(1000 + i * 100);
			empresa.adiciona(f);
		}

		empresa.mostraEmpregados();
	}
}
