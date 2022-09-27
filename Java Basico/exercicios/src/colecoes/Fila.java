package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carla");
		fila.offer("Diana");
		fila.offer("Rafaela");
		fila.offer("Gih");
		
		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		//A Diferença é o comportamento que ocorre quando a fila está vazia
		
		System.out.println(fila.peek()); // se vazio, retora false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // se vazio, lança uma exception
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		
		// Poll e Remove -> obtem o proximo elemento da fila e remove.
		
		System.out.println(fila.poll()); // se vazia retorna false
		System.out.println(fila.remove()); // se vazia lança uma exceção
	}
}
