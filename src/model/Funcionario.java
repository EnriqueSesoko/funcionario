package model;

public class Funcionario {
		
	public Funcionario () {
		super();
	}

	private int id;
	private String nome;
	private double salario;

//	Id
	public void setId (int pId) {		
		this.id = pId;
	}	
	public int getId () {		
		return this.id;
	}
	
//	Nome	
	public void setNome (String pNome) {		
		this.nome = pNome;		
	}	
	public String getNome () {		
		return this.nome;
	}
	
//	Sal�rio	
	public void setSalario (double pSalario) {	
		this.salario = pSalario;		
	}	
	public double getSalario () {		
		return this.salario;
	}

//	toString
	public String toString () {
		return " Funcion�rio [ id : " + getId() + " nome : " + getNome() + " sal�rio : " + getSalario() + " ]";
	}
}


