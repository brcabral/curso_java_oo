package cap05_OrientacaoObjeto2.curso.fjoo.interfaces.impressao.impressoras;

import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.impressao.Impressora;
import cap05_OrientacaoObjeto2.curso.fjoo.interfaces.impressao.Imprimivel;

public class ImpressoraHp implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("------------------------------------------------");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("================================================");
		System.out.println("......................HP........................");
		System.out.println("================================================");
	}
}
