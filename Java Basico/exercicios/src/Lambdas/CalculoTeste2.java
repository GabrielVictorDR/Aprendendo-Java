package Lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// Uma expressão Lambda permite utilizar uma interface sem Criar, Construir e Instanciar uma Classe;
		Calculo calculo = (x, y) -> { return x + y; };
		System.out.println(calculo.executar(2, 3));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(5, 5));
	}
}
