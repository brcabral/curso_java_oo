package cap06_topicosAvancados.curso.fjoo.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");

		Map<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();

		alunos.put(1, a1);
		alunos.put(2, a2);
		alunos.put(3, a3);
		alunos.put(4, a4);
		alunos.put(1, a1);
		alunos.put(5, a2);

		imprimirAlunos(alunos);
		recuperarAluno(alunos, 3);
	}

	private static void imprimirAlunos(Map<Integer, Aluno> alunos) {
		for (Aluno aluno : alunos.values()) {
			System.out.println("Nome: " + aluno.getNome());
		}
	}

	private static void recuperarAluno(Map<Integer, Aluno> alunos, int i) {
		Aluno aluno = alunos.get(i);
		System.out.println("Aluno recuperado: " + aluno.getNome());
	}
}
