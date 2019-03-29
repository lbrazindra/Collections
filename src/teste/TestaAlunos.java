package teste;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior
		
		System.out.println(alunos.size());
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println();
		System.out.println(alunos);
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println();
		System.out.println(pauloEstaMatriculado);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}
