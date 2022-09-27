package fundamentos;

public class InverterString {

	public static void main(String[] args) {
		
		String aSerInvertida = "JAVA";
		String armazenarAqui = "";
		
		for ( int i = aSerInvertida.length() - 1 ; i >= 0; i--) {
			
			armazenarAqui += aSerInvertida.charAt(i);
			
		}
		
		System.out.printf("%s ao contrário fica: %s", aSerInvertida.toUpperCase(), armazenarAqui);
	}
}
