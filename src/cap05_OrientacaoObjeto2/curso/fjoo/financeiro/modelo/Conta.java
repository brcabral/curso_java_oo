package cap05_OrientacaoObjeto2.curso.fjoo.financeiro.modelo;

public abstract class Conta {
	private Fornecedor fornecedor;
	private String descricao;
	private Double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;

	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public abstract void exibirDetalhes();

	public void cancelar() throws OperacaoContaException {
		if (situacaoConta.equals(SituacaoConta.PENDENTE)) {
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Cancelando conta " + this.getDescricao() + " no valor de R$" + this.getValor()
					+ " e vencimento em " + this.getDataVencimento() + " do fornecedor "
					+ this.getFornecedor().getNome() + ".");
		} else {
			throw new OperacaoContaException("Para realizar o cancelamento a situação da conta deve ser pendente.\nA situação atual é " + this.situacaoConta);
		}
	}
}
