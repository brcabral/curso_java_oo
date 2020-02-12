package cap06_topicosAvancados;

public class MegaSena {
	int[] numerosSelecionados = new int[6];

	public void selecionarNumeros() {
		int i = 0;

		while (i < numerosSelecionados.length) {
			int numero = (int) (Math.random() * 60);

			if (!jaSelecionado(numero)) {
				numerosSelecionados[i] = numero;
				i++;
			}
		}
	}

	private boolean jaSelecionado(int numero) {
		boolean jaSelecionado = false;
		for (int i = 0; i < numerosSelecionados.length; i++) {
			if ((numerosSelecionados[i] == numero) || (numero == 0)) {
				jaSelecionado = true;
				break;
			}
		}

		return jaSelecionado;
	}

	public void exibirNumeros() {
		for (int numero : numerosSelecionados) {
			System.out.print(numero + " ");
		}
		System.out.println();
	}
}
