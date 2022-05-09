package controller;

import model.Funcionario;

public class OperacaoFuncionario {

	public OperacaoFuncionario() {
		super();
	}
	public void MostrarFuncionario (Funcionario pF){
		
		String funcionario= pF.getClass().getSimpleName();
		System.out.println(pF);
		
/*		if ("FuncionarioTempoIntegral".equals(funcionario)){
			System.out.println(pF);
		}
		if ("FuncionarioTempoParcial".equals(funcionario)){
			
		}
		if ("FuncionarioTemporario".equals(funcionario)){
			
		}*/
		
	}
}
