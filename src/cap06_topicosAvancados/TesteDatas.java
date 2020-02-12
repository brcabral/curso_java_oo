package cap06_topicosAvancados;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(hoje));

		String dataAniversario = "20/01/1985";
		DateFormat formatadorAniversario = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatadorAniversario.parse(dataAniversario);
			System.out.println("Data de aniversário: " + formatador.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido.");
		}
	}
}
