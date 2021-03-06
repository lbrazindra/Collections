package teste;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Aula;
import modelo.Curso;

public class TestaCurso3 {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();

		System.out.println(aulasImutaveis);
		System.out.println();
		aulasImutaveis.forEach(aula -> {
			System.out.println(aula);
		});

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println();
		System.out.println(aulas);
		System.out.println();
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		System.out.println();
		System.out.println(javaColecoes.getTempoTotal());

	}
}
