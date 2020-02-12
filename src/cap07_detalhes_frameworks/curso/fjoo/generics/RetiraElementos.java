package cap07_detalhes_frameworks.curso.fjoo.generics;

import java.util.List;

public class RetiraElementos {
	public static <T> T recuperarPrimero(List<T> lista) {
		return lista.get(0);
	}
}
