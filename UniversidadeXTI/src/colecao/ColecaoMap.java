package colecao;

import java.util.HashMap;
import java.util.Map;

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("RU", "Rússia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		System.out.println(pais);
		
		System.out.println(pais.containsKey("BR"));
		System.out.println(pais.containsValue("Brasil"));
		System.out.println(pais.get("BR"));

	}

}
