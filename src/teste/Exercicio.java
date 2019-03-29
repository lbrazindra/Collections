package teste;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		// ...
		
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		
		System.out.println();
		System.out.println("Valor, Chave do Map(HashMap)");
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		associacoes.forEach(associacao -> {
			System.out.println("Chave " + associacao.getKey() + ", valor" + associacao.getValue());
		});
	}
}