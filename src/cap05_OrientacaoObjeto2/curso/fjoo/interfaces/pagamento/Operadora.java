package cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento;

public interface Operadora {
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
