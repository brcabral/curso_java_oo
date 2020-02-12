package cap05_OrientacaoObjeto2.curso.fjoo.interfaces.caixa;

import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.impressao.Imprimivel;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {
	private String nomeCliente;
	private String produto;
	private double valorTotal;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}

	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}
}
