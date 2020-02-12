package cap07_detalhes_frameworks;

public class ExemploStringBuffer {
	public static void main(String[] args) {
		// não thread safe - mais rápido
		StringBuilder sb = new StringBuilder();
		
		// thread safe - use quando houver concorrência
		// StringBuffer sb = new StringBuffer();

		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas dúvidas. ");
		sb.append("Estamos aqui para te ajudar.");
		System.out.println(sb.toString());

		sb.insert(26, " da Algaworks");
		System.out.println(sb);
	}
}
