package classes;

public class DataTeste {
	public static void main(String[] args) {
		Data data = new Data();
		data.dia = 8;
		data.mes = 9;
		data.ano = 2022;
		
		Data data2 = new Data();
		 
		Data data3 = new Data(10,11,2000);
		 
		//System.out.printf("Data de Hoje: %d/%d/%d", data.Dia, data.Mes, data.Ano);
		System.out.println(data.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		System.out.println(data3.obterDataFormatada());
	}
} 