package controller;

import java.util.Scanner;

import model.Data;
import model.Funcionario;
import model.FuncionarioTemporario;

public class ContratacaoTemporario extends FuncionarioBase {
	
	public ContratacaoTemporario () {
		super();
	}
	Scanner scan = new Scanner(System.in);
	
	@Override
	
	public Funcionario ContratarFuncionario() {
		FuncionarioTemporario fT = new FuncionarioTemporario();
		inicializarFuncionarioBase(fT);
		Data  data = new Data();
		//Dia
		System.out.println("Digite o Dia de saida :");
		fT.data.setDia(scan.nextInt());
		//Mês
		System.out.println("Digite o Mês de saida :");
		fT.data.setMes(scan.nextInt());
		//Ano
		System.out.println("Digite o Ano de saida :");
		fT.data.setAno(scan.nextInt());
		
		return fT;
	}
	
}
