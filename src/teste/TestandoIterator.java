package teste;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {
	public static void main(String[] args) {

		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		// ...
		
		System.out.println("Percorrendo: ");
		letras.forEach(letra -> {
			System.out.println("Letra " + letra);
		});
		System.out.println("----------");
		System.out.println("Percorrendo: ");
		for (String letra : letras) {
			System.out.println("Letra " + letra);
		}
		System.out.println("----------");
		System.out.println("Percorrendo: ");
		Iterator<String> it = letras.iterator();
		while(it.hasNext()) {
			System.out.println("Letra " + it.next());
		}
	}
}
