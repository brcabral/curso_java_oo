package cap05_OrientacaoObjeto2.curso.fjoo.financeiro.modelo;

public class ContaPagar extends Conta {

	public ContaPagar() {
		//
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.setFornecedor(fornecedor);
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void pagar() throws OperacaoContaException {
		if (this.getSituacaoConta().equals(SituacaoConta.PENDENTE)) {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println(
					"Pagando conta " + this.getDescricao() + " no valor de R$" + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");
		} else {
			throw new OperacaoContaException("Para realizar o pagamento a situação da conta deve ser pendente.\nA situação atual é " + this.situacaoConta);
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("\nConta a Pagar");
		System.out.println("===================================");
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("===================================");
	}
}
