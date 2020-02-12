package cap07_detalhes_frameworks.curso.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(new Funcionario("João"));
		funcionarios.add(new Funcionario("Maria"));

		Funcionario funcionario = RetiraElementos.recuperarPrimero(funcionarios);
		System.out.println(funcionario.getNome());
	}
}
