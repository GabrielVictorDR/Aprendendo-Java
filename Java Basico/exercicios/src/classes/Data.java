package classes;

public class Data {
	 
	int dia;
	int mes;
	int ano;

	Data() {
		
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		
		// chama o construtor abaixo para padronizar a data.
		this(1, 1, 1970);
		 
	}

	Data(int diaAtual, int mesAtual, int anoAtual) {

		this.dia = diaAtual;
		this.mes = mesAtual;
		this.ano = anoAtual;

	}

	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
