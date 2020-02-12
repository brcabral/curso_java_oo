package cap06_topicosAvancados;

import java.util.Scanner;

public class TesteMegaSena {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos jogos deseja gerar? ");
		int quantidadeJogos = entrada.nextInt();

		for (int i = 1; i <= quantidadeJogos; i++) {
			MegaSena mega = new MegaSena();
			mega.selecionarNumeros();
			mega.exibirNumeros();
			System.out.println("----------------------------");
		}

		System.out.println("*** Boa sorte! ***");
	}
}
