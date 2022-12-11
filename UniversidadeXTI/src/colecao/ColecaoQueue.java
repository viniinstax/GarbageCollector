package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {
	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Sandra");
		fila.add("Beatriz");
		fila.add("Ricardo");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll()); // remove o elemento do inicio da fila
		
		System.out.println(fila);
		
		/*outros metodos disponiveis em LinkedList*/
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio"); // coloco no inicio da fila
		f.addLast("Juliana"); // coloco no fim da fila
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
	}

}
