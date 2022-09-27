package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		//Conversão implicita
		double a = 1;
		System.out.println(a);
		
		//Conversão Explicita (CAST)
		float b = (float) 1.0;
		System.out.println(b);
		
		int c = 4;
		//byte d = c; // O Java não lê o número, mas sim o tipo da variável. portanto é necessário fazer o CAST;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 4.12312312512;
		int f = (int) e;
		System.out.println(f);
	
	}
}
