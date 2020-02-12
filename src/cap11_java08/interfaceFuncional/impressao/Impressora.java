package cap11_java08.interfaceFuncional.impressao;

import cap11_java08.interfaceFuncional.compra.Compra;

// Anotação opcional
@FunctionalInterface
public interface Impressora {
	// Uma interface que tem apenas 1 método é chamada de interface funcional
	public void imprimir(Compra c);
}
