package cap11_java08.interfaceFuncional.impressao.impressoras;

import cap11_java08.interfaceFuncional.compra.Compra;
import cap11_java08.interfaceFuncional.impressao.Impressora;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(Compra c) {
		System.out.println("Enviando compra para a impressora HP -> " + c);
	}
}
