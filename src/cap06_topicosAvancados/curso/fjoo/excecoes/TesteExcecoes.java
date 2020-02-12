package cap06_topicosAvancados.curso.fjoo.excecoes;

public class TesteExcecoes {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.depositar(-10);
			// Pode ter várias linhas de código
		} catch (IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal. " + e.getMessage());
		}
	}
}
