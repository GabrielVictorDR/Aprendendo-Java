package controle;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";
		int nota = 7;
		
		switch (nota) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 7: case 8:
			System.out.println("B");
			break;
		case 5: case 6:
			System.out.println("C");
			break;
		case 3: case 4:
			System.out.println("D");
			break;
		case 2: case 1:
			System.out.println("E");
			break;
		default:
			System.out.println("Nenhuma atribuição");
		}
		
		System.out.println("Conceito é: "+ conceito);
	}
}
