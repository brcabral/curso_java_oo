package cap03_orientacaoObjeto1;

public class PrincipalCarro04 {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		// meuCarro.modelo = "Palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
	}
}
