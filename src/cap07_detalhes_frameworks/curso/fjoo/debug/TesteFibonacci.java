package cap07_detalhes_frameworks.curso.fjoo.debug;

public class TesteFibonacci {
	public static void main(String[] args) {
		long posicao = 6;
		long valor = Fibonacci.calcular(posicao);

		System.out.println("F(" + posicao + ") = " + valor);
	}
}
