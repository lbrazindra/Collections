package teste;

import modelo.Aluno;
import modelo.Aula;
import modelo.Curso;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		javaColecoes.matricula(new Aluno("Rodrigo Turini", 34672));
		javaColecoes.matricula(new Aluno("Guilherme Silveira", 5617));
		javaColecoes.matricula(new Aluno("Mauricio Aniche", 17645));
		javaColecoes.matricula(new Aluno("Lucca Braz Barros", 5617));
		
		System.out.println("Quem � o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
	}
}
