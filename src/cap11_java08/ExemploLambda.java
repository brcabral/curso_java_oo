package cap11_java08;

import java.util.List;

import cap11_java08.dao.FaturaDAO;
import cap11_java08.modelo.Fatura;
import cap11_java08.util.EnviarEmail;

public class ExemploLambda {
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		EnviarEmail enviarEmail = new EnviarEmail();

		// Fazendo iteração com foreach
		// for (Fatura f : faturasVencidas) {
		// enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
		// }

		// Fazendo a iteração com lambda - Apenas 1 método
		// faturasVencidas.forEach(f -> enviarEmail.enviar(f.getEmailDevedor(),
		// f.resumo()));

		// Fazendo a iteração com lambda - Mais de 1 método
		faturasVencidas.forEach(f -> {
			enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
	}
}
