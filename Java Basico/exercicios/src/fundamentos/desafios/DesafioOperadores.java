package fundamentos.desafios;

public class DesafioOperadores {
	public static void main(String[] args) {
	   		
		/*
		double a = Math.pow(6 * (3 + 2), 2);
		double b = ((1-5) * (2-7)) / 2;
		
		double parteA = a / (3*2);
		double parteB = Math.pow(b, 2);
		
		System.out.println("parte a: " + parteA);
		System.out.println("parte b: " + parteB);
		
		double resultAB = Math.pow((parteA - parteB), 3);
		double c = Math.pow(10, 3);
		
		double ABsobreC = resultAB / c;
		
		System.out.println(ABsobreC);
		*/ 
		 
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		 
		double numB = (1 - 5) * (2 - 7);
		double denB = 2; 
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("Resultado: " + resultado);
		 
		
		
		
		
		
		
		
	}
}
