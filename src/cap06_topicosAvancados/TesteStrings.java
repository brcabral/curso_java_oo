package cap06_topicosAvancados;

public class TesteStrings {
	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		String s = "Olá"; // Criada a String "Olá"
		s = s + " pessoal!"; // Criado uma nova String "Olá pessoal!"
		System.out.println(s);

		StringBuilder sb = new StringBuilder("Olá"); // Cria a StringBuilder
		sb.append(" pessoal!"); // Reaproveita a StringBuilder
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
	}
}
