package controller;

import java.util.Scanner;

import model.Funcionario;

public abstract class FuncionarioBase {
	public FuncionarioBase () {
		super();
	}
	public Funcionario inicializarFuncionarioBase (Funcionario pF) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cadastro de um novo funcion�rio");		
		//Id
		pF.setId(1);		
		// Nome
		System.out.println("Digite o nome do funcion�rio :");
		pF.setNome(scan.next());
		//Sal�rio
		System.out.println("Digite o sal�rio do funcion�rio :");
		pF.setSalario(scan.nextDouble());
		return pF;
	}
	abstract  Funcionario ContratarFuncionario ();
}
