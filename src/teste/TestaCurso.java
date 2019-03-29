package teste;
import java.util.List;

import modelo.Aula;
import modelo.Curso;

public class TestaCurso {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

//		Tentando adicionar da maneira "antiga". Podemos fazer isso? Teste:

		try {
			javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		} catch (Exception e) {
			System.out.println(e);
		}

//		javaColecoes.getAulas().forEach(aula -> {
//			System.out.println("Aula: " + aula);
//		});

		aulas.forEach(aula -> {
			System.out.println("Aula: " + aula);
		});
	}
}
