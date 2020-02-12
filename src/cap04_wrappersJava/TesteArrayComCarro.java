package cap04_wrappersJava;

public class TesteArrayComCarro {
	public static void main(String[] args) {
		Carro[] carros = new Carro[4];

		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2011;
		System.out.println("Ano fabricacao: " + carros[0].anoDeFabricacao);
		
		Carro c = new Carro();
		c.anoDeFabricacao = 2012;
		carros[1] = c;
		System.out.println("Ano fabricacao: " + carros[1].anoDeFabricacao);
		
	}
}
