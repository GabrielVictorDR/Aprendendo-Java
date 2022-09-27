package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //Converte automaticamente (double -> Double)
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(2);
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("x"));
		
		System.out.println("Tamanho: " + conjunto.size());
		
		System.out.println(conjunto.contains(1.2));
		
		@SuppressWarnings("rawtypes")
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
	}
}
