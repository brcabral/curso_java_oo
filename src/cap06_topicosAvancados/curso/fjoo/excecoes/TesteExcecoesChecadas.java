package cap06_topicosAvancados.curso.fjoo.excecoes;

import cap06_topicosAvancados.SaldoInsuficienteException;

public class TesteExcecoesChecadas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.sacar(60);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println("Saldo: " + cc.getSaldo());

		try {
			cc.sacar(50);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente.");
		} finally {
			System.out.println("Obrigado por utilizar nosso sistema!");
		}
		System.out.println("Saldo agora: " + cc.getSaldo());
	}
}
