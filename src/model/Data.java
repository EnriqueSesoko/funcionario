package model;

public class Data {
	
	public Data () {
		super();
	}
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;
	
//	Dia	
	public void setDia (int pDia) {
		this.dia = pDia;		
	}
	public int getDia () {
		return this.dia;
	}
	
//	Mês	
	public void setMes (int pMes) {
		this.mes = pMes;		
	}
	public int getMes () {
		return this.mes;
	}
	
//	Ano	
	public void setAno (int pAno) {
		this.ano = pAno;		
	}
	public int getAno () {
		return this.ano;
	}
	
//	Hora
	public void setHora (int pHora) {
		this.hora =pHora;
	
	}
	public int getHora () {
		return this.hora;
	}
	
//	Minuto
	public void setMinuto (int pMinuto) {
		this.minuto =pMinuto;
	
	}
	public int getMinuto () {
		return this.minuto;
	}	
	
//	Segundo
	public void setSegundo (int pSegundo) {
		this.segundo =pSegundo;
	
	}
	public int getSegundo () {
		return this.segundo;
	}
	
//	toString
	public String toString () {
		return "Data [ Ano : "+ getAno() + "  Mês : " + getMes() + "  Dia : " + getDia() +
		"  Hora : " + getHora() + "  Minuto : " + getMinuto() + "  Segundo: " + getSegundo() + "]";
	}
}


