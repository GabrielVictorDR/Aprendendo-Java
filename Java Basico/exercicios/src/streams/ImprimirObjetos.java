package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gih");
		
		System.out.println("Iterator...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);
	}
}