package cap07_detalhes_frameworks;

public class TesteCorreioEletronico {
	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

		String[] emails = new String[2];
		emails[0] = "joao@localhost.com";
		emails[1] = "maria@localhost.com";

		// correio.enviarEmails(new String[] { "joao@localhost.com", "maria@localhost.com" });

		correio.enviarEmails("joao@localhost.com", "maria@localhost.com", "pedro@localhost.com");
	}
}
