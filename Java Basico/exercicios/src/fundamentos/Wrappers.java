package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//byte 
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10f;
		System.out.printf("%.2f" , f);
		
		Double d = 1243.5768;
		System.out.println(d);
		
		Boolean boo = Boolean.parseBoolean("true");
		System.out.println(boo);
		System.out.println(boo.toString().toUpperCase());
		
	}
}
