package colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		String[] cores = {"Branco", "Amarelo", "Azul", "Verde",
				"Verde", "Azul"};
		List<String> list = Arrays.asList(cores);
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		/*interface Set não permite elemntos duplicados*/

	}

}
