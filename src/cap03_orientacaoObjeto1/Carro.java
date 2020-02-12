package cap03_orientacaoObjeto1;

public class Carro {
	String fabricante; // null
	String modelo; // null
	String cor; // null
	int anoDeFabricacao; // 0
	boolean biCombustivel; // false

	Proprietario dono; // null
	
	void ligar() {
		if (modelo == null) {
			return;
		}
		
		System.out.println("Ligando o carro: " + modelo);
	}
}
