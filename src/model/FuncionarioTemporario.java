package model;

public class FuncionarioTemporario extends Funcionario{
	
	public FuncionarioTemporario () {
		super ();
	}
	
	public Data data = new Data();
	
//	toString
	public String toString () {
		return " Funcionário Temporário [ Id : '" + getId() + "' Nome : '" + getNome() + "' Salário : '" + getSalario() + 
				"' Dia Fim do contrato : '" + data.getDia() + "'  Mês Fim do contrato : '" + data.getMes() +  "' Ano Fim do contrato : '" + data.getAno() +"'  ]";
	}

}

