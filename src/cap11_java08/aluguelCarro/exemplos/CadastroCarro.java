package cap11_java08.aluguelCarro.exemplos;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

import cap11_java08.aluguelCarro.model.Carro;

public class CadastroCarro {
	public static void main(String[] args) {
		Carro gol = new Carro("Gol", 90.0, Year.of(2012));
		Carro cruze = new Carro("Cruze", 200.0, Year.parse("2013"));
		Carro celta = new Carro("Celta", 80.0, Year.of(2011));

		List<Carro> carros = Arrays.asList(gol, cruze, celta);
		carros.stream().filter(c -> c.getAnoDeFabricacao().isAfter(Year.of(2012)))
				.forEach(c -> System.out.println(c.getModelo()));
	}
}
