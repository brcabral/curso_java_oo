package cap05_OrientacaoObjeto2.curso.fjoo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de fósfero";
		pp.dataValidade = new Date();
		pp.identificar();
	}
}
