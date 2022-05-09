package model;

public class FuncionarioTempoParcial extends Funcionario{
	
		public FuncionarioTempoParcial() {
			// TODO Auto-generated constructor stub
			super();
		}
		public Data dataEntrada = new Data();
		public Data dataSaida = new Data();
/*		Data data = null;
 *      Roda r1 = null;
 *      Roda r2 = null;
 *      Roda r3 = null;
 *      public Data r1 = new Data();
		public Data r2 = new Data();
		data.getHora();			*/
//		toString		
		public String toString () {
			return " Funcionário de Tempo Parcial [ Id : '" + getId() + "' Nome : '" + getNome() + "' Salário : '" + getSalario() + 
					"' Hora de Entrada : '" + dataEntrada.getHora() + "H' - Hora de Saida : '" + dataSaida.getHora() + "H' ]";
		}
		
}


