package model;

public class FuncionarioTempoIntegral extends Funcionario {
	
	public FuncionarioTempoIntegral () {
		super();
		
	}
	
	private int bancoDeHoras;

//	Banco de Horas
	public void setBancoDeHoras (int pBancoDeHoras) {
		this.bancoDeHoras = pBancoDeHoras;		
	}
	public int getBancoDeHoras () {
		return this.bancoDeHoras;
	}
	
//	toString	
	public String toString () {
		return " Funcion�rio de Tempo Integral [ Id : '" + getId() + "' Nome : '" + getNome() + "' Sal�rio : '" + getSalario() + 
				"' Banco de Horas :'" + getBancoDeHoras() + "'  ]";
	}
	
}
