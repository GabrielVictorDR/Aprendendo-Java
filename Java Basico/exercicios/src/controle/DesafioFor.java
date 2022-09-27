package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		// MINHA VERSÃO:
//		String valor = "#";
//		String v1 = "a";
//		String v2 = "aaaaaaaaaaa";
//		for(int i = v1.length() ; i < v2.length() ; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		//CORREÇÃO:
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}	
 