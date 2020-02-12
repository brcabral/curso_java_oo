package cap06_topicosAvancados.curso.fjoo.equals_hascode;

import java.util.Set;

public class TesteSetHashSet {
	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

		// De alguma forma, sorteia o nome de uma aluno e constroi o objeto
		Aluno alunoSorteado = new Aluno("Maria");

		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns " + alunoSorteado.getNome() + "! Você ganhou um prêmio.");
		} else {
			System.out.println("Aluno não cadastrado no banco de dados.");
		}
	}
}
