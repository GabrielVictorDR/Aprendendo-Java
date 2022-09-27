package fundamentos.desafios;

public class DesafioLogico {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// Se apenas um der certo: TV 32
		// Se os dois derem certo: TV 50
		
		//Se comprar TV: tomar sorvete
		//Nenhuma tv = sem sorvete;
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuarta = true;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuarta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuarta;
		boolean tomouSorvete = comprouTV50 || comprouTV32;
		boolean estaMaisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou tv 50\"? " + comprouTV50);
		System.out.println("Comprou tv 32\"? " + comprouTV32);
		System.out.println("Tomou Sorvete? " + tomouSorvete);
		System.out.println("Está mais saudável? " + estaMaisSaudavel);
	}
}
