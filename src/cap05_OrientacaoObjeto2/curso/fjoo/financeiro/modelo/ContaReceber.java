package cap05_OrientacaoObjeto2.curso.fjoo.financeiro.modelo;

public class ContaReceber extends Conta {
	Cliente cliente = new Cliente();

	public ContaReceber() {
		//
	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void receber() throws OperacaoContaException {
		if (this.getSituacaoConta().equals(SituacaoConta.PENDENTE)) {
			this.situacaoConta = SituacaoConta.PAGA;
			System.out.println(
					"Recebendo conta " + this.getDescricao() + " no valor de R$" + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");
		} else {
			throw new OperacaoContaException(
					"Para realizar o pagamento a situação da conta deve ser pendente.\nA situação atual é "
							+ this.situacaoConta);
		}
	}

	public void cancelar() throws OperacaoContaException {
		if (this.getValor() <= 50000d) {
			super.cancelar();
		} else {
			throw new OperacaoContaException("Somente contas com o valor inferior a 50.000 podem ser canceladas.");
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("\nConta a Receber");
		System.out.println("===================================");
		System.out.println("Cliente: " + this.getCliente().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("===================================");
	}
}
