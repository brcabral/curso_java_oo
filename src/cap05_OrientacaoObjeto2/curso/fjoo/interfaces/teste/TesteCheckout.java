package cap05_OrientacaoObjeto2.curso.fjoo.interfaces.teste;

import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.caixa.Checkout;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.caixa.Compra;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.impressao.Impressora;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.impressao.impressoras.ImpressoraHp;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.Cartao;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.Operadora;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.operadora.RedeCard;

public class TesteCheckout {
	public static void main(String[] args) {
		Operadora operadora = new RedeCard();
		Impressora impressora = new ImpressoraHp();

		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456789");

		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);

		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
}
