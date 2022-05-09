package controller;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import model.Data;
import model.Funcionario;
import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;

public class ContratacaoTempoIntegral extends FuncionarioBase {
	
	public ContratacaoTempoIntegral () {
		super();
	}
	
	Scanner scan = new Scanner(System.in);

	@Override
	public Funcionario ContratarFuncionario() {
		
		FuncionarioTempoIntegral fTI = new FuncionarioTempoIntegral();
		inicializarFuncionarioBase(fTI);
		//Banco de Horas
		System.out.println("Digite o Banco de Horas :");
		fTI.setBancoDeHoras(scan.nextInt());
		return fTI;
	}
}
