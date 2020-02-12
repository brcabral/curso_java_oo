package cap05_OrientacaoObjeto2.curso.fjoo.abstrata;

public class TesteClasseAbstrata {
	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		p.descricao = "Caixa de leite";

		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "10/03/2012";

		p.imprimirDescricao();
	}
}
