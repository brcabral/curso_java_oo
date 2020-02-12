package cap07_detalhes_frameworks.curso.fjoo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {
	public static void main(String[] args) {
		String[] emails = { "joao@localhost.com", "maria@localhost.com", "jose@", "ricardo@localhost.com" };

		Pattern patter = Pattern.compile("\\w+@\\w+\\.\\w+");
		for (String email : emails) {
			Matcher matcher = patter.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " é um email válido!");
			}
		}
	}
}
