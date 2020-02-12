package cap11_java08;

import java.util.List;

import cap11_java08.dao.FaturaDAO;
import cap11_java08.modelo.Fatura;

public class ExemploStream {
	public static void main(String[] args) {
		List<Fatura> faturas = new FaturaDAO().buscarFaturasVencidas();

		// for (Fatura fatura : faturas) {
		// if (fatura.getValor() > 250.0) {
		// System.out.println("Alerta: Fatura acima de R$250.0 -> " + fatura);
		// }
		// }

		// Stream<Fatura> st = faturas.stream().filter(fatura -> fatura.getValor() >
		// 250);
		// st.forEach(f -> System.out.println(f));

		// faturas.stream()
		// .filter(fatura -> fatura.getValor() > 250)
		// .forEach(f -> System.out.println(f));

		faturas.stream()
			.filter(Fatura::estaoEmRisco)
			.forEach(System.out::println);
	}
}
