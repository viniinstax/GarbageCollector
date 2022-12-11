package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
	
	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("A"));
		
		c.remove("A");
		System.out.println(c.toString());
		
		/*Grupos*/
		
		Collection<String> c2 = Arrays.asList("o", "u");
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2)); // verifica se existem todos esses elementos
		c.removeAll(c2);
		
		System.out.println(c.toString());
		
		/*percorrer os elemntos*/
		for( String string : c) {
			System.out.println(string);
		}
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
	}

}
