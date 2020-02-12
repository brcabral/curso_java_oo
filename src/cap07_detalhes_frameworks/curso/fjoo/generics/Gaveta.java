package cap07_detalhes_frameworks.curso.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<G> {
	private List<G> colecao = new ArrayList<>();

	public void colocar(G g) {
		colecao.add(g);
	}

	public G retirarPrimeiro() {
		return colecao.get(0);
	}
}
