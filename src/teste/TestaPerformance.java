package teste;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

//		Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numeros = new HashSet<Integer>();

		long inicio1 = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}
		long fim1 = System.currentTimeMillis();
		
		long inicio2 = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		long fim2 = System.currentTimeMillis();
		

		long tempoDeExecucao1 = fim1 - inicio1;
		long tempoDeExecucao2 = fim2 - inicio2;

		System.out.println("Tempo gasto na inserção: " + tempoDeExecucao1);
		System.out.println("Tempo gasto na busca: " + tempoDeExecucao2);
		

	}

}