package cap06_topicosAvancados.curso.fjoo.equals_hascode;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {
	public static Set<Aluno> buscarAlunos() {
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Ricardo"));
		alunos.add(new Aluno("Maria"));
		alunos.add(new Aluno("Tiago"));
		alunos.add(new Aluno("Tatiane"));

		return alunos;
	}
}
