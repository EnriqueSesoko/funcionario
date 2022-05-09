package controller;

import java.util.Scanner;

import model.Funcionario;

public abstract class FuncionarioBase {
	public FuncionarioBase () {
		super();
	}
	public Funcionario inicializarFuncionarioBase (Funcionario pF) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cadastro de um novo funcionário");		
		//Id
		pF.setId(1);		
		// Nome
		System.out.println("Digite o nome do funcionário :");
		pF.setNome(scan.next());
		//Salário
		System.out.println("Digite o salário do funcionário :");
		pF.setSalario(scan.nextDouble());
		return pF;
	}
	abstract  Funcionario ContratarFuncionario ();
}
