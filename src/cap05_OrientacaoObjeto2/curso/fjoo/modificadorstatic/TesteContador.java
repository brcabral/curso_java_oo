package cap05_OrientacaoObjeto2.curso.fjoo.modificadorstatic;

public class TesteContador {
	public static void main(String[] args) {
		Contador c = new Contador();
		c.incrementar();
		// System.out.println("Contador: " + Contador.COUNT);

		Contador.COUNT++;
		// System.out.println("Contador: " + Contador.COUNT);
		Contador.imprimirContador();
	}

}
