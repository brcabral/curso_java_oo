package cap05_OrientacaoObjeto2.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {
	
	String dataValidade;

	@Override
	public void imprimirDescricao() {
		// TODO Auto-generated method stub
		System.out.println("Descrição: " + super.getDescricao() + ". Com vencimento em " + dataValidade);
	}

}
