package cap07_detalhes_frameworks.curso.fjoo.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {
	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();

		logger.info("Começando a aplicação");
		// código da aplicação
		logger.info("Finalizando a aplicação");
	}
}
