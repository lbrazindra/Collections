package teste;

import modelo.Aluno;
import modelo.Aula;
import modelo.Curso;

public class TestaCursoComAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados:");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println("Aluno: " + aluno);
		});

//		System.out.println();
//		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
//
//		System.out.println();
//		Aluno turini = new Aluno("Rodrigo Turini", 34672);
//		System.out.println("E esse Turini, está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(turini));
//		System.out.println(turini.hashCode());
//		System.out.println(a1.hashCode());
//		System.out.println(a1.equals(turini));

	}
}
