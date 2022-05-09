package controller;

import java.util.Scanner;

import model.Funcionario;
import model.FuncionarioTempoParcial;

public class ContratacaoTempoParcial extends FuncionarioBase {
	
	public ContratacaoTempoParcial () {
		super();
	}
	Scanner scan = new Scanner(System.in);

	@Override
	public Funcionario ContratarFuncionario() {
		
		FuncionarioTempoParcial fTP = new FuncionarioTempoParcial();
		inicializarFuncionarioBase(fTP);
		//Hora de Entrada		
		System.out.println("Digite a Hora de entrada :");
		fTP.dataEntrada.setHora(scan.nextInt());
		//Hora de Saída
		System.out.println("Digite a Hora de Saída");
		fTP.dataSaida.setHora(scan.nextInt());
		
		return fTP;
	}
	
}
