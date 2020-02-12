package cap07_detalhes_frameworks;

public class CorreioEletronico {
	public void enviarEmails(String... emails) {
		// enviar e-mail
		for (String email : emails) {
			System.out.println("E-mail enviado para " + email);
		}
	}
}
