package model;

public class FuncionarioTemporario extends Funcionario{
	
	public FuncionarioTemporario () {
		super ();
	}
	
	public Data data = new Data();
	
//	toString
	public String toString () {
		return " Funcion�rio Tempor�rio [ Id : '" + getId() + "' Nome : '" + getNome() + "' Sal�rio : '" + getSalario() + 
				"' Dia Fim do contrato : '" + data.getDia() + "'  M�s Fim do contrato : '" + data.getMes() +  "' Ano Fim do contrato : '" + data.getAno() +"'  ]";
	}

}

