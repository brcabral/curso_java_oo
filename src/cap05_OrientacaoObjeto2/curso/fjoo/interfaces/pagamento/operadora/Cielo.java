package cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.operadora;

import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.Autorizavel;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.Cartao;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal() < 100;
	}

}
