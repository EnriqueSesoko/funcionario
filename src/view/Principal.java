package view;

import java.util.Scanner;
import controller.ContratacaoTempoIntegral;
import controller.ContratacaoTempoParcial;
import controller.ContratacaoTemporario;
import controller.OperacaoFuncionario;
import model.Funcionario;
import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;

public class Principal {
	
	public static void main(String[] args) {
		
		ContratacaoTempoIntegral contratacaoTempoIntegral = new ContratacaoTempoIntegral();
		ContratacaoTempoParcial contratacaoTempoParcial = new ContratacaoTempoParcial();	
		ContratacaoTemporario contratacaoTemporario = new ContratacaoTemporario();
		OperacaoFuncionario operacaoFuncionario = new OperacaoFuncionario ();
		Scanner scan = new Scanner(System.in);	
		System.out.println("Escolha o Tipo de Funcionário.\n"
				+ "Para Funcionário de Tempo INTEGRAL digite : '1'\n"
				+ "Para Funcionários do Tipo PARCIAL digite : '2'\n"
				+ "Para Funcionários do Tipo TEMPORÁRIO digite : '3'\n");
		int n = scan.nextInt();
/*		FuncionarioTempoIntegral fI = null;
		FuncionarioTempoParcial fP= null;
		FuncionarioTemporario fT= null;	*/
		switch (n) {
		case 1 : operacaoFuncionario.MostrarFuncionario(contratacaoTempoIntegral.ContratarFuncionario());break;			
		case 2 : operacaoFuncionario.MostrarFuncionario(contratacaoTempoParcial.ContratarFuncionario()); break;
		case 3 : operacaoFuncionario.MostrarFuncionario(contratacaoTemporario.ContratarFuncionario()); break;
		default : System.out.println("Erro !"); break;
		
		}		
	}
}
