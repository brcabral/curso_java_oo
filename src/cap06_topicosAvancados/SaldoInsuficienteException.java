package cap06_topicosAvancados;

public class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}

}
