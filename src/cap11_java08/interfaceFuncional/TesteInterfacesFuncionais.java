package cap11_java08.interfaceFuncional;

import cap11_java08.interfaceFuncional.compra.Compra;
import cap11_java08.interfaceFuncional.impressao.Impressora;

public class TesteInterfacesFuncionais {
	public static void main(String[] args) {
		Impressora imp = (compra) -> {
			System.out.println("Visualizando impressão! " + compra);
		};

		Compra compra = new Compra("Sabonete", 2.5);
		imp.imprimir(compra);
	}
}
