package cap07_detalhes_frameworks.curso.fjoo.debug;

public class Fibonacci {
	// F(n) = F(n-1) + F(n - 2)
	// 0, 1, 1, 2, 3, 5, 8...
	public static long calcular(long posicao) {
		if ((posicao == 0) || (posicao == 1)) {
			return posicao;
		}

		long valor = calcular(posicao - 1) + calcular(posicao - 2);
		return valor;
	}
}
