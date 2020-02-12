package cap07_detalhes_frameworks.curso.fjoo.javadoc;

public class TesteJavadoc {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João Silva", 3000);
		System.out.println(funcionario.adiatamentoViagem(5, true));
	}
}
